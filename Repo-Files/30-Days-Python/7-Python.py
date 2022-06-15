# Day 7 of 30

# *** List ***

# List (arrays) are 1 of 4 built in data types used to store data.
# List items are ordered, changeable, and allow duplicate values.
# List items are indexed, the first item has index [0], the second item has index [1] etc.


family_members = ["Kris", "Bella", "Joey", "Gene", "AraBella", "Evan", "Dallas"]

print(family_members[0]) # Prints "Kris"
print(family_members[2]) # Prints "Joey"
print(family_members[-1]) # Prints "Dallas"

print(len(family_members)) # Prints 7

kris = ["Kris", 34, "male", False] ## Contains different data types

# List constructor is used as list() inside you build with parenthesis not brackets

bella = list(("AnaBella", 41, "female", True))

print(bella)

# List is a collection which is ordered and changeable. Allows duplicate members.

## Access List Item(s) - Using bracket notation to identify value at index OR use : with indexes to provide filtered list.

## Change List Item(s) - Using bracket notation and then assigning the new values. This can be done in ranges as well.

family_members[len(family_members)-1:] = ["Dallas", "Momma", "Poppa", "Mahni", "Wehllo"]
# family_members[len(family_members)-1:] = ["Dallas"]

print(family_members)

## Adding List Item(s) - Identify where you'd like to add items to list and add them.

family_members.insert(-1, "Lizzard") # insert() function takes first parameter of index wanting to insert and then next param is what is being inserted.
print(family_members)

family_members.append("Hamster") # append() method takes in param of item needing to be added and adds it to the end of the list.
print(family_members)

family_1 = ["kris_S", "tye"]
family_2 = ["anabella", "kris_M"]
family_1.extend(family_2) # extend() method takes a list as param and adds it to another list to make one larger list. Can add any iterable.

print(family_1)

# The remove() method removes the specified item.

# The pop() method removes the specified index. If no index provided, last item gets removed.

# The del keyword also removes the specified index: The del keyword can also delete the list completely.

del family_members[-1]

print(family_members)

# The clear() method empties the list. The list still remains, but it has no content.

family_1.clear()
print(family_1)

# Sort List Alphanumerically OR from least to greatest - use sort() method.

family_members.sort()
print(family_members)

# Sort List reverse Alphanumerically OR from greatest to least- use sort() method.

family_members.sort(reverse=True)
print(family_members)

# By default the sort() method is case sensitive, resulting in all capital letters being sorted before lower case letters:

# The reverse() method reverses the current sorting order of the elements.

family_members.reverse()
print(family_members)

# There are ways to make a copy, one way is to use the built-in List method copy().
# Another way to make a copy is to use the built-in method list().

# There are several ways to join, or concatenate, two or more lists in Python. One of the easiest ways are by using the + operator.
# You can append() or extend() to join arrays/lists as well.

# Python has a set of built-in methods that you can use on lists.

# append()	Adds an element at the end of the list
# clear()	Removes all the elements from the list
# copy()	Returns a copy of the list
# count()	Returns the number of elements with the specified value
# extend()	Add the elements of a list (or any iterable), to the end of the current list
# index()	Returns the index of the first element with the specified value
# insert()	Adds an element at the specified position
# pop()	    Removes the element at the specified position
# remove()	Removes the item with the specified value
# reverse()	Reverses the order of the list
# sort()	Sorts the list













