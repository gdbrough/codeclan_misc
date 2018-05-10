require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry-byebug' )

require_relative("./models/pizza_order.rb")

# index
get "/pizza-orders" do
  @orders = PizzaOrder.all()
  erb(:index)
end

# create
post "/pizza-orders" do
  @order = PizzaOrder.new(params)
  @order.save()
  erb(:create)
end

# new
get "/pizza-orders/new" do
  erb(:new)
end

# edit
get "/pizza-orders/:id/edit" do
  @order = PizzaOrder.find(params[:id])
  @toppings = ["Margherita", "Vegetarian", "Pepperoni", "Italian Sausage"]
  erb(:edit)
end

# edit
post "/pizza-orders/:id" do
  @order = PizzaOrder.new(params)
  @order.update()
  # erb(:update)
  redirect "/pizza-orders"
end

# delete
post "/pizza-orders/:id/delete" do
  @order = PizzaOrder.new(params)
  @order.delete()
  # erb(:delete)
  redirect "/pizza-orders"
end

# show
get "/pizza-orders/:id" do
  @order = PizzaOrder.find(params[:id])
  erb(:show)
end
