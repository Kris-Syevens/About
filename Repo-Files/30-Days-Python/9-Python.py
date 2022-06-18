# Day 9 of 30

# *** Python Sets ***

# Set
# Sets are used to store multiple items in a single variable.

# Set is one of 4 built-in data types in Python used to store collections of data, the other 3 are List, Tuple, and Dictionary, all with different qualities and usage.

# A set is a collection which is unordered, unchangeable*, and unindexed.

# Sets are written with curly brackets.

my_set = {1, 2, 3}

print(type(my_set))  # type set

# Get the Length of a Set
# To determine how many items a set has, use the len() function.

print(len(my_set)) # 3

# Set items can be of any data type:

# It is also possible to use the set() constructor to make a set.

# Access Items
# You cannot access items in a set by referring to an index or a key.

# But you can loop through the set items using a for loop, or ask if a specified value is present in a set, by using the in keyword.

# To add one item to a set use the add() method.

# To add items from another set into the current set, use the update() method.

# The object in the update() method does not have to be a set, it can be any iterable object (tuples, lists, dictionaries etc.).

# Remove "banana" by using the remove() method:

# Remove "banana" by using the discard() method:

# You can also use the pop() method to remove an item, but this method will remove the last item. Remember that sets are unordered, so you will not know what item that gets removed.

# The return value of the pop() method is the removed item.

# The clear() method empties the set:

# The del keyword will delete the set completely:

# You can use the union() method that returns a new set containing all items from both sets, or the update() method that inserts all the items from one set into another:

# Set Methods
# Python has a set of built-in methods that you can use on sets.

# add()	                        Adds an element to the set
# clear()	                    Removes all the elements from the set
# copy()	                    Returns a copy of the set
# difference()	                Returns a set containing the difference between two or more sets
# difference_update()	        Removes the items in this set that are also included in another, specified set
# discard()	                    Remove the specified item
# intersection()	            Returns a set, that is the intersection of two other sets
# intersection_update()	        Removes the items in this set that are not present in other, specified set(s)
# isdisjoint()	                Returns whether two sets have a intersection or not
# issubset()	                Returns whether another set contains this set or not
# issuperset()	                Returns whether this set contains another set or not
# pop()	                        Removes an element from the set
# remove()	                    Removes the specified element
# symmetric_difference()	    Returns a set with the symmetric differences of two sets
# symmetric_difference_update()	inserts the symmetric differences from this set and another
# union()	                    Return a set containing the union of sets
# update()	                    Update the set with the union of this set and others








