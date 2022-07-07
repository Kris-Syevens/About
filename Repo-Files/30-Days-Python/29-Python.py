# Day 29 of 30

# DESCRIPTION:
# You are required to create a simple calculator that returns the result of addition, subtraction, multiplication or division of two numbers.

# Your function will accept three arguments:
# The first and second argument should be numbers.
# The third argument should represent a sign indicating the operation to perform on these two numbers.

# if the variables are not numbers or the sign does not belong to the list above a message "unknown value" must be returned.

# Example:
# calculator(1,2,"+"); //=> result will be 3
# calculator(1,2,"&"); //=> result will be "unknown value"
# calculator(1,"k","*"); //=> result will be "unknown value"

def calculator(num1, num2, oper):

    if type(num1) == int and type(num2) == int:
        if oper == "+" or oper == "-" or oper == "*" or oper == "/":
            if oper == "+":
                return num1 + num2
            elif oper == "-":
                return num1 - num2
            elif oper == "*":
                return num1 * num2
            elif oper == "/":
                return num1 / num2
        else:
            return "unknown value"
    else:
        return "unknown value"

print(calculator(2,2,"*"))

