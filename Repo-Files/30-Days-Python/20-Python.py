# Day 20 of 30


# DESCRIPTION:
# Color Ghost
# Create a class Ghost

# Ghost objects are instantiated without any arguments.

# Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

# ghost = new Ghost();
# ghost.color //=> "white" or "yellow" or "purple" or "red"
import random

class Ghost:
    def __init__(self):
        colors = ["white", "yellow", "purple", "red"]
        self.color = colors[random.randrange(0,len(colors))]
        

ghost_1 = Ghost()
ghost_2 = Ghost()
ghost_3 = Ghost()

print(ghost_1.color)
print(ghost_2.color)
print(ghost_3.color)

