require("pry")
require_relative("models/pizza_order.rb")
require_relative("models/customer.rb")

PizzaOrder.delete_all()
Customer.delete_all()

customer1 = Customer.new({'name' => 'Jeff Bridges'})
customer1.save()

order1 = PizzaOrder.new({
  'customer_id' => customer1.id,
  'topping' => 'All the meat',
  'quantity' => 2
  })

order1.save()

order1.customer()

customer1.pizza_order()

binding.pry
nil
