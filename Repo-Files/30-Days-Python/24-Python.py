# Day 24 of 30

# DESCRIPTION:
# In this kata you will have to write a function that takes litres and pricePerLitre (in dollar) as arguments.

# Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more litres get a discount of 10 cents per litre, and so on every two litres, up to a maximum discount of 25 cents per litre. But total discount per litre cannot be more than 25 cents. Return the total cost rounded to 2 decimal places. Also you can guess that there will not be negative or non-numeric inputs.

# Good Luck!

# Note
# 1 Dollar = 100 Cents

def fuel_price(litres, pricePerLitre):
    discount = 0
    for x in range(2,litres + 1):
        if x < 11:
            if x % 2 == 0:
                discount += .05
            else:
                continue
        else:
            continue
    
    return float(litres * (pricePerLitre * (1-discount)))

print(fuel_price(5,2)) # 9.00
print(fuel_price(10,2)) # 15.00
print(fuel_price(15,2)) # 22.50