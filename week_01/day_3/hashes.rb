meals_array = ["yoghurt", "roll", "steak"]
p meals_array[0]

my_first_hash = Hash.new()
my_second_hash = {}

meals = {"breakfast" => "yoghurt", "lunch" => "roll", "dinner" => "steak"}
p meals
p meals["breakfast"]
p meals["supper"]

silly_hash = {1 => "2", 2 => 3, 4 => false}
p silly_hash
p silly_hash[4]

meals["supper"] = "toast"
p meals

meals["supper"] = "tea and toast"
p meals

p meals.keys()
p meals.values()

inverted = meals.invert()
p inverted

meals.default = "Pringles"
p meals["brunch"]

new_hash = Hash["a", 1, "b", 2]
p meals.merge(new_hash)

# p :my_symbol
#
# p :my_symbol + :hello

meals = {breakfast: "yoghurt", lunch: "roll"}

p meals
p meals[:lunch]

countries = {
  uk: {
    capital: "London",
    population: 6000000,
    languages: ["English", "Gaelic", "Welsh"]
  },
  germany: {
    capital: "Berlin",
    population: 3470000,
    languages: ["German", "German Deutsch","Turkish"]
  }
}

p countries
p countries[:uk]
p countries[:uk][:population]
p countries.keys
p countries[:uk].keys
p countries[:uk][:languages][0]

p countries[:germany]
p countries[:germany][:population]
p countries.keys
p countries[:germany].keys
p countries[:germany][:languages][-1]

uk_population_string = countries[:uk][:population].to_s()
germany_population_string = countries[:germany][:population].to_s()

p "UK Population #{uk_population_string}"
p "Germany's Population #{germany_population_string}"
