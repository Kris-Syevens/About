# Day 12 of 30

## *** FUNCTIONS ***

# A function is a block of code which only runs when it is called.

# You can pass data, known as parameters, into a function.

# A function can return data as a result.

# In Python a function is defined using the def keyword:

def say_hello():
    print("Hello World!")


say_hello()

# Arguments
# Information can be passed into functions as arguments.

# Arguments are specified after the function name, inside the parentheses. You can add as many arguments as you want, just separate them with a comma.

name = "Kris"

def intro(name):
    print("Hello, my name is " + name)

intro(name)

# Parameters or Arguments?
# The terms parameter and argument can be used for the same thing: information that are passed into a function.

# From a function's perspective:

# A parameter is the variable listed inside the parentheses in the function definition.

# An argument is the value that is sent to the function when it is called.

# Arbitrary Arguments, *args
# If you do not know how many arguments that will be passed into your function, add a * before the parameter name in the function definition.

# This way the function will receive a tuple of arguments, and can access the items accordingly:

def my_family(*members):
    print("My husbands name is " + members[0])

my_family("Kris", "Bella","AraBella", "Evan")

# Arbitrary Arguments, *args
# If you do not know how many arguments that will be passed into your function, add a * before the parameter name in the function definition.

# This way the function will receive a tuple of arguments, and can access the items accordingly:

def my_function(**kid):
  print("His last name is " + kid["lname"])

my_function(fname = "Evan", lname = "Syevens")

# Default Parameter Value
# The following example shows how to use a default parameter value.

# If we call the function without argument, it uses the default value:

def add_two(a=1, b=2):
    return a + b

print(add_two(3)) # 5

# function definitions cannot be empty, but if you for some reason have a function definition with no content, put in the pass statement to avoid getting an error.

# Recursion
# Python also accepts function recursion, which means a defined function can call itself.

# Recursion is a common mathematical and programming concept. It means that a function calls itself. This has the benefit of meaning that you can loop through data to reach a result.

# The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power. However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.

def tri_recursion(k):

  if(k > 0):
    print("loop")
    result = k + tri_recursion(k - 1)
    print(result)
  else:
    result = 0
  return result

tri_recursion(6)

# A lambda function is a small anonymous function.

# A lambda function can take any number of arguments, but can only have one expression.
# lambda arguments : expression

x = lambda a : a + 10

print(x(5))



