require_relative("../db/sql_runner.rb")

class Movie

  attr_reader :id, :title, :genre, :rating, :budget
  attr_writer :title, :genre, :rating, :budget

  def initialize(options)
    @id = options["id"].to_i if options["id"]
    @title = options["title"]
    @genre = options["genre"]
    @rating = options["rating"]
    @budget = options["budget"]
  end

  def save()
    sql = "INSERT INTO movies (title, genre, rating, budget)
    VALUES ($1, $2, $3, $4)
    RETURNING id"
    values = [@title, @genre, @rating, @budget]
    movie = SqlRunner.run( sql, values ).first
    @id = movie['id'].to_i
  end

  def update()
    sql = "UPDATE movies SET title = $1, genre = $2, rating = $3, budget = $4 WHERE id = $5"
    values = [@title, @genre, @rating, @budget, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM movies WHERE id = $1"
    values =[@id]
    SqlRunner.run(sql, values)
  end

  def moviestars()
    sql = "SELECT moviestars.* FROM moviestars
    INNER JOIN castings ON moviestars.id = castings.moviestar_id
    WHERE movie_id = $1"
    values = [@id]
    moviestars = SqlRunner.run(sql, values)
    return moviestars.map { |star| Moviestar.new(star) }
  end

  def castings()
    sql = "SELECT castings.* FROM castings
    INNER JOIN moviestars ON castings.id = moviestars.id
    WHERE movie_id = $1"
    values = [@id]
    castings = SqlRunner.run(sql, values)
    return castings.map { |casting| Casting.new(casting) }
  end

  def remove_fees_from_budget()
    # Pull fee(s) from Moviestar
    fees = castings().map {|star| star.fee.to_i}
    # Calculation total fees
    # total_fees = 0
    # for fee in fees
    #   total_fees += fee
    # end
  # or
    # fees.each {| fee | total_fees += fee}
  # or
    total_fees = fees.sum
    # Movie Budget -= Total Fees
    @budget -= total_fees
    update()
  end

  def self.delete_all()
    sql = "DELETE FROM movies"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM movies"
    films = SqlRunner.run(sql)
    return films.map { |film| Movie.new(film) }
  end

  def self.find(id)
    sql = "SELECT * FROM movies WHERE id = $1"
    values = [id]
    films = SqlRunner.run(sql, values)
    return Movie.new(films[0])
  end

end
