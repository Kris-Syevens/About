# Day 3 of 30

# *** Python Numbers ***

# There are three numeric types in Python:

# int - do not include decimals
# float - written with decimals
# complex - written with "j" on the end

# Variables of numeric types are created when you assign a value to them

a = 1
b = 2.4
c = a + b

print(type(a))
print(type(b))
print(type(c))
print(c)

# *** Type Conversion ***

# You can convert from one type to another with the int(), float(), and complex() methods

d =  float(a) # Converting a which is an int to a float
e = int(b) # Converting b from float to int. Acts as truncate when doing this.

print(e)

# *** Random Number ***

# Python does not have a random() function to make a random number, but Python has a built-in module called random that can be used to make random numbers.

import random

z = random.randrange(1,11)
print(z)