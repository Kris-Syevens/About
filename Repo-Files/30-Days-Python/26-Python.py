# Day 26 of 30

# DESCRIPTION:
# You need to write a function that reverses the words in a given string. A word can also fit an empty string. If this is not clear enough, here are some examples:

# As the input may have trailing spaces, you will also need to ignore unneccesary whitespace.

# Example (Input --> Output)

def reverse_string(string):
    arr = string.split(" ")
    arr.reverse()
    new_string = ""
    for x in arr:
        new_string += f"{x} "

    return new_string.strip()

print(reverse_string("Hello World."))
print(reverse_string("My name is Kris. Nice to meet you!"))
