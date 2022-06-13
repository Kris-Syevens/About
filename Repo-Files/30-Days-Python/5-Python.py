# Day 5 of 30

# Modify Strings

# The upper() method returns the string in upper case:

name = "kris"

print(name.upper()) # returns KRIS

# The lower() method returns the string in lower case:

name2 = "KRIS"

print(name2.lower()) # returns kris

# The strip() method removes any whitespace from the beginning or the end:

full_name = "    Kristofer Syevens  "

print(full_name.strip()) # "Kristofer Syevens"

# The replace() method replaces a string with another string:

print(full_name.strip().replace("Kristofer", "Kris")) # Chained methods together to return "Kris Syevens"

# The split() method splits the string into substrings if it finds instances of the separator:

print(full_name.strip().split(" ")) # Chained with strip to return a list (or Array) with two items: ["Kristofer", "Syevens"]

# To concatenate, or combine, two strings you can use the + operator.

first_name = "Kris"
last_name = "Syevens"

print(first_name + last_name) #This prints the two strings together as one without spaces
print(first_name + " " + last_name) #This prints the two strings together as one with a space.

# *** String Format ***

# The format() method takes the passed arguments, formats them, and places them in the string where the placeholders {} are:

title = "software engineer"

intro = "Hello, my name is {}! I am a {} with JPMorgan Chase."

specialty = "back-end"

print(intro.format(first_name, title))

# You can use index numbers {0} to be sure the arguments are placed in the correct placeholders:

elevator_pitch = "Hello, my name is {2}! I am a {0} with JPMorgan Chase. I work on {1} development."

print(elevator_pitch.format(title, specialty, first_name ))

# To insert characters that are illegal in a string, use an escape character.

# An escape character is a backslash \ followed by the character you want to insert.

print("I am a \"software developer\" but what I really do is solve real business problems.")



