require_relative("../db/sql_runner.rb")

class Moviestar

  attr_reader :id, :first_name, :last_name
  attr_writer :first_name, :last_name

  def initialize(options)
    @id = options["id"].to_i if options["id"]
    @first_name = options["first_name"]
    @last_name = options["last_name"]
  end

  def save()
    sql = "INSERT INTO moviestars (first_name, last_name)
    VALUES ($1, $2)
    RETURNING id"
    values = [@first_name, @last_name]
    moviestar = SqlRunner.run( sql, values ).first
    @id = moviestar['id'].to_i
  end

  def update()
    sql = "UPDATE moviestars SET first_name = $1, last_name = $2 WHERE id = $3"
    values = [@first_name, @last_name, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM moviestars WHERE id = $1"
    values =[@id]
    SqlRunner.run(sql, values)
  end

  def movies()
    sql = "SELECT movies.* FROM movies
    INNER JOIN castings ON movies.id = castings.movie_id
    WHERE moviestar_id = $1"
    values = [@id]
    movies = SqlRunner.run(sql, values)
    return movies.map { |movie| Movie.new(movie) }
  end

  def castings()
    sql = "SELECT castings.* FROM castings
    INNER JOIN movies ON castings.id = movies.id
    WHERE moviestar_id = $1"
    values = [@id]
    castings = SqlRunner.run(sql, values)
    return castings.map { |casting| Casting.new(casting) }
  end

  def self.delete_all()
    sql = "DELETE FROM moviestars"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM moviestars"
    stars = SqlRunner.run(sql)
    return stars.map { |star| Moviestar.new(star) }
  end

  def self.find(id)
    sql = "SELECT * FROM moviestars WHERE id = $1"
    values = [id]
    stars = SqlRunner.run(sql, values)
    return Moviestar.new(stars[0])
  end

end
