# Day 8 of 30

# *** Python Tuples ***

# Tuples are used to store multiple items in a single variable.
# Tuple is one of 4 built-in data types in Python used to store collections of data, the other 3 are List, Set, and Dictionary, all with different qualities and usage.
# A tuple is a collection which is ordered and unchangeable. Tuples are written with round brackets.

stop_light = ("red", "yellow", "green")

print(type(stop_light))

# To create a tuple with only one item, you have to add a comma after the item, otherwise Python will not recognize it as a tuple.

PI = (3.14,)

print(type(PI))

# It is also possible to use the tuple() constructor to make a tuple.

# You can access tuple items by referring to the index number, inside square brackets:

#You can specify a range of indexes by specifying where to start and where to end the range.

# To determine if a specified item is present in a tuple use the in keyword:

# Once a tuple is created, you cannot change its values. Tuples are unchangeable, or immutable as it also is called.
# But there is a workaround. You can convert the tuple into a list, change the list, and convert the list back into a tuple.

## Adding to Tuple

# Since tuples are immutable, they do not have a build-in append() method, but there are other ways to add items to a tuple.

# 1. Convert into a list: Just like the workaround for changing a tuple, you can convert it into a list, add your item(s), and convert it back into a tuple.

# 2. Add tuple to a tuple. You are allowed to add tuples to tuples, so if you want to add one item, (or many), create a new tuple with the item(s), and add it to the existing tuple:

# Convert the tuple into a list, remove "apple", and convert it back into a tuple:

# The del keyword can delete the tuple completely:

# In Python, we are also allowed to extract the values back into variables. This is called "unpacking":

syevens_family = ("Kris", "Bella", "Joey", "Gene", "AraBella", "Evan", "Dallas")

dad, mom, son_Oldest, daughter_Oldest, daughter_Youngest, son_Youngest, dog = syevens_family

print(dad, mom, son_Oldest, daughter_Oldest, daughter_Youngest, son_Youngest, dog )

# Using Asterisk*
# If the number of variables is less than the number of values, you can add an * to the variable name and the values will be assigned to the variable as a list:

# If the asterisk is added to another variable name than the last, Python will assign values to the variable until the number of values left matches the number of variables left.

# Join Two Tuples
# To join two or more tuples you can use the + operator:

# If you want to multiply the content of a tuple a given number of times, you can use the * operator:

# Tuple Methods
# Python has two built-in methods that you can use on tuples.


# count()	Returns the number of times a specified value occurs in a tuple
# index()	Searches the tuple for a specified value and returns the position of where it was found





