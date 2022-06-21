# Day 13 of 30

## *** CLASSES / OBJECTS ***

# Python Classes/Objects
# Python is an object oriented programming language.

# Almost everything in Python is an object, with its properties and methods.

# A Class is like an object constructor, or a "blueprint" for creating objects.

# Create a Class
# To create a class, use the keyword class:

class Sample:
    pi = 3.14

test = Sample()

print(test.pi) # 3.14

# The __init__() Function
# The examples above are classes and objects in their simplest form, and are not really useful in real life applications.

# To understand the meaning of classes we have to understand the built-in __init__() function.

# All classes have a function called __init__(), which is always executed when the class is being initiated.

# Use the __init__() function to assign values to object properties, or other operations that are necessary to do when the object is being created:

class FamilyMember:
    def __init__(self, name, age, sex, eye_color, hair_color, role):
        self.name = name
        self.age = age
        self.sex = sex
        self.eye_color = eye_color
        self.hair_color = hair_color
        self.role = role

    def __str__(self):
        return f"{self.name} {self.age} {self.sex} {self.role}"

    def greet(self):
        print("Hello, my name is " + self.name)
    
syevens_one = FamilyMember("Kris", 34, "Male", "Hazel", "Brown", "Dad")
print(syevens_one)

# The __str__() Function
# The __str__() function controls what should be returned when the class object is represented as a string.

# If the __str__() function is not set, the string representation of the object is returned:

# Object Methods
# Objects can also contain methods. Methods in objects are functions that belong to the object.

# Let us create a method in the Person class:

syevens_one.greet()

# Create a Child Class
# To create a class that inherits the functionality from another class, send the parent class as a parameter when creating the child class:

class FamilyPets(FamilyMember):
    pass

dallas = FamilyPets("Dallas", 1, "male", "brown", "brown", "man's best friend.")

dallas.greet()

# Create a Child Class
# To create a class that inherits the functionality from another class, send the parent class as a parameter when creating the child class:

# Use the super() Function
# Python also has a super() function that will make the child class inherit all the methods and properties from its parent:

# class Student(Person):
#   def __init__(self, fname, lname):
#     super().__init__(fname, lname)
#     self.graduationyear = 2019
