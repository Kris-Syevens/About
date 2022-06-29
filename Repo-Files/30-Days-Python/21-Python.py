# Day 21 of 30

# DESCRIPTION:
# Teach snoopy and scooby doo how to bark using object methods. Currently only snoopy can bark and not scooby doo.

# snoopy.bark(); // return "Woof"
# scoobydoo.bark(); // undefined
# Use method prototypes to enable all Dogs to bark.

class Dog:
    def __init__(self):
        pass

    def bark(self):
        return "Woof"


snoopy = Dog()
scooby_doo = Dog()

print(snoopy.bark())
print(scooby_doo.bark())

