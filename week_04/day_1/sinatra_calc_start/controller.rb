require("sinatra")
require("sinatra/contrib/all")

require_relative("./models/calculator.rb")

get "/instructors" do
  @instructors = ["Alan", "Ally", "John", "Steve"]
  erb(:instructors)
end

get "/add/:num1/:num2" do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @calculation = calculator.add()
  erb(:result)
end

get "/subtract/:num1/:num2" do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @calculation = calculator.subtract()
  erb(:result)
end

get "/multiply/:num1/:num2" do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @calculation = calculator.multiply()
  erb(:result)
end

get "/divide/:num1/:num2" do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @calculation = calculator.divide()
  erb(:result)
end

get "/" do
  erb(:home)
end

get "/about-us" do
  erb(:about)
end
