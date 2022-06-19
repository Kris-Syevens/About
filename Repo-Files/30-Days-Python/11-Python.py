# Day 11 of 30

## *** LOOPS AND CONDITIONALS ***

# Python Conditions and If statements

# Python supports the usual logical conditions from mathematics:

# Equals:                   a == b
# Not Equals:               a != b
# Less than:                a < b
# Less than or equal to:    a <= b
# Greater than:             a > b
# Greater than or equal to: a >= b

# An "if statement" is written by using the if keyword.

# The elif keyword is pythons way of saying "if the previous conditions were not true, then try this condition".

# The else keyword catches anything which isn't caught by the preceding conditions.



a = 10
b = 20

if a < b:
    print("a is less than b")
elif a > b:
    print("a is greater than b")
else:
    print("a equals b")

# Indentation
# Python relies on indentation (whitespace at the beginning of a line) to define scope in the code. Other programming languages often use curly-brackets for this purpose.

# If you have only one statement to execute, you can put it on the same line as the if statement.

if 10 <  20: print("10 is less than 20")

# If you have only one statement to execute, one for if, and one for else, you can put it all on the same line:


print("Wrong") if 10 < 5 else print("Right") # Also considered Ternary Operator

# print("A") if a > b else print("=") if a == b else print("B") Another Ternary with 3 conditions.

# The and keyword is a logical operator, and is used to combine conditional statements:

if 7 > 5 and 10 > 5:
    print("They sure are!")


# The or keyword is a logical operator, and is used to combine conditional statements:

if 7 > 8 or 10 > 5:
    print("One of us is not like the other!") # still prints since 2nd logical statement is correct.

# if statements cannot be empty, but if you for some reason have an if statement with no content, put in the pass statement to avoid getting an error. **Similar to continue in JS**

# Python Loops
# Python has two primitive loop commands:

# while loops
# for loops


# With the while loop we can execute a set of statements as long as a condition is true.

counter = 10

while counter > 0:
    print(counter)
    counter -= 1

# With the break statement we can stop the loop even if the while condition is true:

# With the else statement we can run a block of code once when the condition no longer is true:

# Python For Loops
# A for loop is used for iterating over a sequence (that is either a list, a tuple, a dictionary, a set, or a string).

# This is less like the for keyword in other programming languages, and works more like an iterator method as found in other object-orientated programming languages.

# With the for loop we can execute a set of statements, once for each item in a list, tuple, set etc.

name = "Kris"

for x in name:
    print(x)



# The range() Function
# To loop through a set of code a specified number of times, we can use the range() function,
# The range() function returns a sequence of numbers, starting from 0 by default, and increments by 1 (by default), and ends at a specified number.

# Else in For Loop
# The else keyword in a for loop specifies a block of code to be executed when the loop is finished:

# The pass Statement
# for loops cannot be empty, but if you for some reason have a for loop with no content, put in the pass statement to avoid getting an error.