# Day 4 of 30

# *** Python Casting ***

# Casting in python is done using constructor functions:

# int() - constructs an integer number from an integer literal, a float literal (by removing all decimals), or a string literal (providing the string represents a whole number)
# float() - constructs a float number from an integer literal, a float literal or a string literal (providing the string represents a float or an integer)
# str() - constructs a string from a wide variety of data types, including strings, integer literals and float literals

# literal casting/construction/conversion

a = int(5.4) # will truncate after decimal and return integer 5
b = int("7") # will convert from string to integer 7.
# c = int("7.4") # this is invalid. The string being converted must be an integer. Floats, complex, or otherwise won't compile.

print(a,b)

d = float(7) # converts to 7.0
e = float("12") # converts to 12.0

print(d,e)

f = str(12.7) # converts to "12.7"
g = str(1988) # converts to "1988"

print(f,g)

# *** Python Strings ***

# Strings in python are surrounded by either single quotation marks, or double quotation marks.

# 'kris' and "kris" are the same.

print("Kris") # string literal to print to console.

name = "Kris"

print(name) # you can print the variable that holds the string.

# ** Multiline Strings - You can assign a multiline string to a variable by using three quotes (single or double quotes fine)**

intro = """Hi, my name is Kris Syevens.
I am a software engineer specializing in 
full-stack web development!"""

print(intro)

# Strings are Arrays
# Like many other popular programming languages, strings in Python are arrays of bytes representing unicode characters.

# However, Python does not have a character data type, a single character is simply a string with a length of 1.

# Square brackets can be used to access elements of the string.

print(name[0]) # This will print the first letter in the string since strings are arrays and arrays are 0 based index. This will price "K"

# Looping Through a String
# Since strings are arrays, we can loop through the characters in a string, with a for loop.

for char in name:
    print(char)

# loop above will print "K" "r" "i" "s" on separate lines.

# String Length - You can use the built in len() function to get the length or a string or array. len(name) will print 4.
print(len(name))

# You can use "if" "in" "not in" keywords on strings.

# *** Slicing Strings ***

print(name[2:4]) # Prints "is" from "Kris" The second parameter is an up to but not including index position for the slice.

print(name[:3]) # Print "Kri". If starting index isn't inputted it will begin slicing from first index
print(name[2:]) # Print "is". If ending index isn't inputted it will slice until the end of the string or Array.

print(name[-2:]) # Print "is". Negative indexes start from the end of the string or array and go backwards.
print(name[-4:]) # Print "Kris". Negative indexes start from the end of the string or array and go backwards.