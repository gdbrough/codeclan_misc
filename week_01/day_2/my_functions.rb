# def greet()
#   words = "hey"
#   return words
# end
#
# def greet_two()
#   return words
# end
#
# puts greet()
# puts greet_two()

def greet(name, time_of_day)
  return "Good " + time_of_day + ", " + name
end

puts greet("Graeme", "morning")

def greet_two(name, time_of_day)
  return "Good #{time_of_day}, #{name.capitalize()}"
end

puts greet_two("graeme", "afternoon")
