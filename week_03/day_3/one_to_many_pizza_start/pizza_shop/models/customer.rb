require('pg')
require_relative('../db/sql_runner.rb')

class Customer

  attr_reader :id, :name

  def initialize(options)
    @id = options['id'].to_i
    @name = options['name']
  end

  def save()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "INSERT INTO customers (name) VALUES($1) RETURNING id"
    values = [@name]
    # db.prepare("save", sql)
    # @id = db.exec_prepared("save", values)[0]["id"].to_i
    # db.close()
    @id = SQLRunner.run(sql, values)[0]["id"].to_i
  end

  def self.delete_all()
    sql = "DELETE FROM customers"
    SQLRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM customers"
    customers = SQLRunner.run(sql)
    return customers.map { |person| Customer.new(person) }
  end

  def pizza_order()
    sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"
    values = [@id]
    orders = SQLRunner.run(sql, values)
    return orders.map { |order| PizzaOrder.new(order) }
  end

end
