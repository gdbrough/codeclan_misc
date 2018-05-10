# def say_hello(name):
#     return "Hello " + name
#
# my_name = "Graeme"
# print(say_hello(my_name))

# def greet(name):
#     if(name == "John"):
#         print("Hi " + name)
#     elif(name == "Alan"):
#         print("A'right " + name)
#     else:
#         print("Sorry I don't recognise you")
#
# print("End of function")
# greet("John")
# greet("Alan")
# greet("Graeme")

# my_list = ["Spam", "Ham", "Eggs"]
# my_list.append("Jam")
# my_list.remove("Ham")
# print(my_list.pop())
# print(len(my_list))

# my_tuple = ("Spam", "Ham", "Eggs")
# my_tuple.append("Jam")
# print(my_tuple)

# favourite_foods = ["pizza", "Doughnuts", "Bacon"]
#
# for food in favourite_foods:
#     print food

# numbers = [1,2,3,4,5]
# multiplied_numbers = [number * 2 for number in numbers]
#
# even_multiplied_numbers = [number * 2 for number in numbers if number % 2 ==0]
#
# print(multiplied_numbers)
# print(even_multiplied_numbers)

person = {
    "name": "John",
    "favourite_foods": ["Pizza", "Cake", "Bacon"]
}

print(person)
print(person["name"])
print(person.keys())
