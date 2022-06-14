# Day 6 of 30

# Boolean Values

# In programming you often need to know if an expression is True or False.

# You can evaluate any expression in Python, and get one of two answers, True or False.

print( 12 > 7) # returns True
print( 12 < 7) # returns False

# The bool() function allows you to evaluate any value, and give you True or False in return

print(bool("Kris")) # True.
print(bool("")) # False, empty strings are falsy.

# Falsy = empty objects, explicit false, false expressions, and 0

# bool(False)
# bool(None)
# bool(0)
# bool("")
# bool(())
# bool([])
# bool({})

# Functions can return True or False based on logic.

# *** Python Operators ***

# Python divides the operators in the following groups:

# Arithmetic operators

# Arithmetic operators are used with numeric values to perform common mathematical operations:

# +	    Addition	    x + y	
# -	    Subtraction	    x - y	
# *	    Multiplication	x * y	
# /	    Division	    x / y	
# %	    Modulus	        x % y	
# **	Exponentiation	x ** y	
# //	Floor division	x // y

# Assignment operators

# Assignment operators are used to assign values to variables:

# =	    x = 5	    x = 5	
# +=	x += 3	    x = x + 3	
# -=	x -= 3	    x = x - 3	
# *=	x *= 3	    x = x * 3	
# /=	x /= 3	    x = x / 3	
# %=	x %= 3	    x = x % 3	
# //=	x //= 3	    x = x // 3	
# **=	x **= 3	    x = x ** 3	
# &=	x &= 3	    x = x & 3	
# |=	x |= 3	    x = x | 3	
# ^=	x ^= 3	    x = x ^ 3	
# >>=	x >>= 3	    x = x >> 3	
# <<=	x <<= 3	    x = x << 3

# Comparison operators

# Comparison operators are used to compare two values:

# ==	Equal	                    x == y	
# !=	Not equal	                x != y	
# >	    Greater than	            x > y	
# <	    Less than	                x < y	
# >=	Greater than or equal to	x >= y	
# <=	Less than or equal to	    x <= y

# Logical operators

# Logical operators are used to combine conditional statements:

# and 	Returns True if both statements are true	                x < 5 and  x < 10	
# or	Returns True if one of the statements is true	            x < 5 or x < 4	
# not	Reverse the result, returns False if the result is true	    not(x < 5 and x < 10)

# Identity operators

# Identity operators are used to compare the objects, not if they are equal, but if they are actually the same object, with the same memory location:

# is 	    Returns True if both variables are the same object	        x is y	
# is not	Returns True if both variables are not the same object	    x is not y

# Membership operators

# Membership operators are used to test if a sequence is presented in an object:

# in 	    Returns True if a sequence with the specified value is present in the object	    x in y	
# not in	Returns True if a sequence with the specified value is not present in the object	x not in y

# Bitwise operators

# Bitwise operators are used to compare (binary) numbers:

# & 	AND	                    Sets each bit to 1 if both bits are 1
# |	    OR	                    Sets each bit to 1 if one of two bits is 1
# ^	    XOR	                    Sets each bit to 1 if only one of two bits is 1
# ~	    NOT	                    Inverts all the bits
# <<	Zero fill left shift	Shift left by pushing zeros in from the right and let the leftmost bits fall off
# >>	Signed right shift	    Shift right by pushing copies of the leftmost bit in from the left, and let the rightmost bits fall off
