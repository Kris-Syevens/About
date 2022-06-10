# Day 1 of 30

#  *** COMMENTS ***
# Comments are created using the hash or "#" symbol prior to the comment.

# *** PRINTING TO CONSOLE ***
# Print using the print() built-in method and passing in the argument you want to display on console. Below is the classic Hello World string printed,

print("Hello World!")


# *** VARIABLES ***
# A variable name must start with a letter or the underscore character
# A variable name cannot start with a number
# A variable name can only contain alpha-numeric characters and underscores (A-z, 0-9, and _ )
# Variable names are case-sensitive (age, Age and AGE are three different variables)
# Naming convention for python can follow camelCase or PascalCase or snake_case

my_name = "Kris" # valid
_my_name = "Kris" # valid
# 1my_name = "Kris" # invalid
# !my-name = "Kris" # invalid
My_Name = "Kris" # valid

print(my_name)
print(_my_name)
print(My_Name)

# User can initialize multiple variables and assign within one line HOWEVER this is not really readable and should be avoided.

a, b, c = 1, 2 ,3

print(a)
print(b)
print(c)

# User can assign multiple variables to the same value or reference by point to one another.

x = y = z = "Python"

print(x)
print(y)
print(z)

# You can unpack or destructure a list (array) by utilizing one line.

programming_languages = ["Python", "Java", "JavaScript"]

best, worst, decent = programming_languages

print(best)
print(worst)
print(decent)

# the "+" or plus operator can be used to combine two variables of like kind. If using between two strings, the two variables will become one string. If used with two numbers, it acts as a math operator and will provide the sum between the two.

age = 25
name = "kris"
birth_month = "december"
birth_day = 7

print(age + birth_day)
print(name + birth_month)
