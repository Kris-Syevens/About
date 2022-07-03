# Day 25 of 30

# DESCRIPTION:
# Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

# Example:    
# 5.5589 is rounded 5.56   
# 3.3424 is rounded 3.34
import math 

def round_me(long):
    return (math.ceil(long*100)/100)


print(round_me(5.5589))
print(round_me(3.3424))