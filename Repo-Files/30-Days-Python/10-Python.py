# Day 10 of 30

# *** Python Dictionaries ***

# Dictionary
# Dictionaries are used to store data values in key:value pairs.
# A dictionary is a collection which is ordered*, changeable and do not allow duplicates.
# Dictionaries are written with curly brackets, and have keys and values:
# The values in dictionary items can be of any data type:

syevens_Dad = {
    "name": "Kristofer Syevens",
    "sex": "male",
    "age": 34,
    "pet(s)": True,

}

print(syevens_Dad)

# It is also possible to use the dict() constructor to make a dictionary.

# You can access the items of a dictionary by referring to its key name, inside square brackets:

print(syevens_Dad["name"]) # prints "Kristofer Syevens"

# There is also a method called get() that will give you the same result:

print(syevens_Dad.get("age")) # prints 34

# The keys() method will return a list of all the keys in the dictionary.

print(syevens_Dad.keys())

# Use bracket notation and literal to add key/value pairs to the dictionary

syevens_Dad["eye_color"] = "Hazel"

print(syevens_Dad)

# The values() method will return a list of all the values in the dictionary.

print(syevens_Dad.values())

# The items() method will return each item in a dictionary, as tuples in a list.

print(syevens_Dad.items())

# Check if Key Exists - To determine if a specified key is present in a dictionary use the in keyword:

# Change Values You can change the value of a specific item by referring to its key name:

# The update() method will update the dictionary with the items from the given argument.

# The argument must be a dictionary, or an iterable object with key:value pairs.

syevens_Dad.update({"name":"Kris"})

print(syevens_Dad)

# The pop() method removes the item with the specified key name:

# The popitem() method removes the last inserted item (in versions before 3.7, a random item is removed instead):

# The del keyword removes the item with the specified key name:

# The clear() method empties the dictionary:

# You cannot copy a dictionary simply by typing dict2 = dict1, because: dict2 will only be a reference to dict1, and changes made in dict1 will automatically also be made in dict2.

# There are ways to make a copy, one way is to use the built-in Dictionary method copy().

# Another way to make a copy is to use the built-in function dict().

# A dictionary can contain dictionaries, this is called nested dictionaries.

# Dictionary Methods
# Python has a set of built-in methods that you can use on dictionaries.

# clear()	    Removes all the elements from the dictionary
# copy()	    Returns a copy of the dictionary
# fromkeys()	Returns a dictionary with the specified keys and value
# get()	        Returns the value of the specified key
# items()	    Returns a list containing a tuple for each key value pair
# keys()	    Returns a list containing the dictionary's keys
# pop()	        Removes the element with the specified key
# popitem()	    Removes the last inserted key-value pair
# setdefault()	Returns the value of the specified key. If the key does not exist: insert the key, with the specified value
# update()	    Updates the dictionary with the specified key-value pairs
# values()	    Returns a list of all the values in the dictionary





