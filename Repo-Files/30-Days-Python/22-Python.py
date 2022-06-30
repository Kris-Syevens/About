# Day 22 of 30

# DESCRIPTION:
# Your collegue wrote an simple loop to list his favourite animals. But there seems to be a minor mistake in the grammar, which prevents the program to work. Fix it! :)

# If you pass the list of your favourite animals to the function, you should get the list of the animals with orderings and newlines added.

# For example, passing in:

# animals = [ 'dog', 'cat', 'elephant' ]
# will result in:

# list_animals(animals) == '1. dog\n2. cat\n3. elephant\n'

def list_animals(arr):
    corrected_list = ""
    for x in range(1, len(arr)+1):
        new_line = f"{x}. {arr[x-1]}\n" 
        corrected_list += new_line
    return corrected_list


print(list_animals([ 'dog', 'cat', 'elephant' ]))