fruits = ["apple","banana","grape","orange"]

p fruits
p fruits[0]
p fruits[4]

#fruits[2] = "pear"
fruits.insert(2, "pear")

p fruits
p fruits[-1]

p fruits.first()
p fruits.first(2)

p fruits.last()
p fruits.last(2)

# def number_to_month_name(month)
#   months = ["January","February","March"]
#   return months[month - 1]
# end
#
# p number_to_month_name(1)

my_array = []
my_array = Array.new()

p my_array

fruits.push("strawberry") #adds new element to end
p fruits

p fruits.pop() #removes last element in array
p fruits
p fruits.pop(2) #removes last 2 elements
p fruits

fruits << "lemon"
p fruits

fruits.shift() #removes from first position [0]
p fruits

fruits.unshift("apple") # adds to first position on array
p fruits

fruits.push("banana")
p fruits

fruits.delete("banana") #removes all occurences of "banana"
p fruits

fruits_and_numbers = ["apple", 1, "grape", 2]

p fruits_and_numbers

crazy_array = [1, 2, 3, 4, [5, 6, 7]]

p crazy_array
p crazy_array[3]
p crazy_array[4]
p crazy_array[4][0]
p crazy_array[4][2]

apple = "apple"
banana = "banana"

new_fruits = [apple * 5, banana]

p new_fruits

fruits[10] = "pear"

p fruits.compact()

p fruits

p fruits.compact!()
