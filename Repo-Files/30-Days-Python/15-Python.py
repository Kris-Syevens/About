# Day 15 of 30

# DESCRIPTION:
# Input: Array of elements

# ["h","o","l","a"]

# Output: String with comma delimited elements of the array in th same order.

# "h,o,l,a"

# Note: if this seems too simple for you try the next level

def reprint(arr):
    string = ""
    for x in arr:
        string += x
        string += ","
    
    return string[:-1]

print(reprint(["h","o","l","a"])) # "h,o,l,a"

