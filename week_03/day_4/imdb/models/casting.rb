require_relative("../db/sql_runner.rb")

class Casting

  attr_reader :id, :movie_id, :moviestar_id, :fee
  attr_writer :movie_id, :moviestar_id, :fee

  def initialize(options)
    @id = options["id"].to_i if options["id"]
    @movie_id = options["movie_id"]
    @moviestar_id = options["moviestar_id"]
    @fee = options["fee"]
  end

  def save()
    sql = "INSERT INTO castings (movie_id, moviestar_id, fee)
    values ($1, $2, $3)
    RETURNING id"
    values = [@movie_id, @moviestar_id, @fee]
    casting = SqlRunner.run(sql, values).first
    @id = casting['id'].to_i
  end

  def update()
    sql = "UPDATE castings SET movie_id = $1, moviestar_id = $2 WHERE id = $3"
    values = [@movie_id, @moviestar_id, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM castings WHERE id = $1"
    values =[@id]
    SqlRunner.run(sql, values)
  end

  def self.delete_all()
    sql = "DELETE FROM castings"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM castings"
    casting = SqlRunner.run(sql)
    return casting.map { |cast| Casting.new(cast) }
  end

  def self.find(id)
    sql = "SELECT * FROM castings WHERE id = $1"
    values = [id]
    casting = SqlRunner.run(sql, values)
    return Casting.new(casting[0])
  end

end
