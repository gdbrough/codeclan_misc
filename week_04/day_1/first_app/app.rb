require("sinatra")
require("sinatra/contrib/all")

get "/hi" do
  "Howdy"
end

get "/roll-die" do
  # random_number = rand(1..6)
  # "#{random_number}"
  rand(1..6).to_s
end

get "/name/:first/:last" do
  return "Your name is : #{params[:first]} #{params[:last]}"
end

get "/friends/:number" do
  friends = ["Joey", "Monica", "Chandler", "Rachel", "Ross", "Pheobe"]
  index = params[:number].to_i - 1
  return friends[index]
end

get "/square/:num" do
  number = params[:num].to_i
  return (number * number).to_s
  # return "numbersquared = #{num * num}"
end

get "/pet/:hello" do
  "Hello pet"
end

get "/pet/:name" do
  "Hello #{params[:name]}"
end
