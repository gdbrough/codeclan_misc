require_relative("models/casting.rb")
require_relative("models/movie.rb")
require_relative("models/moviestar.rb")

require( 'pry-byebug' )

Moviestar.delete_all()
Movie.delete_all()
Casting.delete_all()

moviestar1 = Moviestar.new({ "first_name" => "Harrison", "last_name" => "Ford" })
moviestar1.save()
moviestar2 = Moviestar.new({ "first_name" => "Mark", "last_name" => "Hamill" })
moviestar2.save()
moviestar3 = Moviestar.new({ "first_name" => "Paul", "last_name" => "Le Matt" })
moviestar3.save()
moviestar4 = Moviestar.new({ "first_name" => "John", "last_name" => "Howard" })
moviestar4.save()
moviestar5 = Moviestar.new({ "first_name" => "Jeff", "last_name" => "Bridges" })
moviestar5.save()


movie1 = Movie.new({"title" => "Star Wars", "genre" => "Sci-Fi", "rating" => 10, "budget" => 100000})
movie1.save()
movie2 = Movie.new({"title" => "American Graffiti", "genre" => "Comedy", "rating" => 8, "budget" => 500000})
movie2.save()
movie3 = Movie.new({"title" => "Apollo 13", "genre" => "Sci-Fi", "rating" => 9, "budget" => 5000000})
movie3.save()
movie4 = Movie.new({"title" => "Metal Man", "genre" => "Superhero", "rating" => 7, "budget" => 10000000})
movie4.save()



casting1 = Casting.new({"movie_id" => movie3.id, "moviestar_id" => moviestar1.id, "fee" => 10000})
casting1.save()
casting2 = Casting.new({"movie_id" => movie1.id, "moviestar_id" => moviestar2.id, "fee" => 9000})
casting2.save()
casting3 = Casting.new({"movie_id" => movie2.id, "moviestar_id" => moviestar1.id, "fee" => 3000})
casting3.save()
casting4 = Casting.new({"movie_id" => movie2.id, "moviestar_id" => moviestar3.id, "fee" => 9000})
casting4.save()
casting5 = Casting.new({"movie_id" => movie2.id, "moviestar_id" => moviestar4.id, "fee" => 9000})
casting5.save()
casting6 = Casting.new({"movie_id" => movie3.id, "moviestar_id" => moviestar4.id, "fee" => 9000})
casting6.save()
casting7 = Casting.new({"movie_id" => movie4.id, "moviestar_id" => moviestar5.id, "fee" => 9000})
casting7.save()

moviestar4.first_name = "Ron"
moviestar4.update()

moviestar5.delete()

movie4.title = "Iron Man"
movie4.update()

movie4.delete()

casting1.movie_id = movie1.id
casting1.update()

casting6.delete()

# p Moviestar.all()
# p Movie.all()
# p Casting.all()

# p Moviestar.find(moviestar1.id)
# p Movie.find(movie2.id)
# p Casting.find(casting4.id)

# moviestar1.movies()
# moviestar1.castings()

# movie1.moviestars()
# movie1.castings()

movie1.remove_fees_from_budget()

binding.pry
nil
