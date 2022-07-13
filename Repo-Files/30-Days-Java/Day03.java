// Day 3 of 30 
import java.math.*;
import java.util.Scanner;


public class Day03 {
    // Notes

    // Java - What is OOP?
    // OOP stands for Object-Oriented Programming.

    // Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

    // Object-oriented programming has several advantages over procedural programming:

    // OOP is faster and easier to execute
    // OOP provides a clear structure for the programs
    // OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
    // OOP makes it possible to create full reusable applications with less code and shorter development time
    // Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

    //     Java Classes/Objects
    // Java is an object-oriented programming language.

    // Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

    // A Class is like an object constructor, or a "blueprint" for creating objects.

    // Note that the constructor name must match the class name, and it cannot have a return type (like void).

    //     Static vs. Public
    // You will often see Java programs that have either static or public attributes and methods.

    // a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:

    // void means that the method does not return a value, only executes code/logic.

    //Java Class Attributes
    // In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

    //Accessing Attributes
    // You can access attributes by creating an object of the class, and by using the dot syntax (.):
    // The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

    //  Java Class Methods
    //  You learned from the Java Methods chapter that methods are declared within a class, and that they are used to perform certain actions:

    //Java Constructors
    // A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

    //     Modifiers
    // By now, you are quite familiar with the public keyword that appears in almost all of our examples:

    //     The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

    // We divide modifiers into two groups:

    // Access Modifiers - controls the access level
    // Non-Access Modifiers - do not control access level, but provides other functionality

    // Access Modifiers
    // For classes, you can use either public or default:

    // Modifier	    Description	
    // public	    The class is accessible by any other class	
    // default	    The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
    //              For attributes, methods and constructors, you can use the one of the following:

    // Modifier	    Description	
    // public	    The code is accessible for all classes	
    // private	    The code is only accessible within the declared class	
    // default	    The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
    // protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter	
    
    // Non-Access Modifiers
    // For classes, you can use either final or abstract:

    // Modifier	    Description	
    // final	    The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
    // abstract	    The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)	
    //              For attributes and methods, you can use the one of the following:

    // Modifier	        Description
    // final	        Attributes and methods cannot be overridden/modified
    // static	        Attributes and methods belongs to the class, rather than an object
    // abstract	        Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
    // transient	    Attributes and methods are skipped when serializing the object containing them
    // synchronized	    Methods can only be accessed by one thread at a time
    // volatile	The     value of an attribute is not cached thread-locally, and is always read from the "main memory"

    // Final
    // If you don't want the ability to override existing attribute values, declare attributes as final:

    // Static
    // A static method means that it can be accessed without creating an object of the class, unlike public:

    // Abstract
    // An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

    //     Encapsulation
    // The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

    // declare class variables/attributes as private
    // provide public get and set methods to access and update the value of a private variable
    // Get and Set
    // You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

    // The get method returns the variable value, and the set method sets the value.

    // Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

    //     Why Encapsulation?
    // Better control of class attributes and methods
    // Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    // Flexible: the programmer can change one part of the code without affecting other parts
    // Increased security of data

    //     Java Packages & API
    // A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

    // Built-in Packages (packages from the Java API)
    // User-defined Packages (create your own packages)

    // Java Inheritance (Subclass and Superclass)
    // In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

    // subclass (child) - the class that inherits from another class
    // superclass (parent) - the class being inherited from
    // To inherit from a class, use the extends keyword.


    // Java Polymorphism
    // Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

    // Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

    // For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

    //     Java Inner Classes
    // In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

    // To access the inner class, create an object of the outer class, and then create an object of the inner class:

    // Example
    // class OuterClass {
    //   int x = 10;

    //   class InnerClass {
    //     int y = 5;
    //   }
    // }

    // public class Main {
    //   public static void main(String[] args) {
    //     OuterClass myOuter = new OuterClass();
    //     OuterClass.InnerClass myInner = myOuter.new InnerClass();
    //     System.out.println(myInner.y + myOuter.x);
    //   }
    // }

    // // Outputs 15 (5 + 10)

    //     Private Inner Class
    // Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

    // Abstract Classes and Methods
    // Data abstraction is the process of hiding certain details and showing only essential information to the user.
    // Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

    // The abstract keyword is a non-access modifier, used for classes and methods:

    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

    // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    // An abstract class can have both abstract and regular methods:

    // Interfaces
    // Another way to achieve abstraction in Java, is with interfaces.

    // An interface is a completely "abstract class" that is used to group related methods with empty bodies:

    // Example
    // // interface
    // interface Animal {
    //   public void animalSound(); // interface method (does not have a body)
    //   public void run(); // interface method (does not have a body)
    // }

    //     Notes on Interfaces:
    // Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
    // Interface methods do not have a body - the body is provided by the "implement" class
    // On implementation of an interface, you must override all of its methods
    // Interface methods are by default abstract and public
    // Interface attributes are by default public, static and final
    // An interface cannot contain a constructor (as it cannot be used to create objects)
    // Why And When To Use Interfaces?
    // 1) To achieve security - hide certain details and only show the important details of an object (interface).

    // 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

    //         Enums
    // An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

    // To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

    // Example
    // enum Level {
    //   LOW,
    //   MEDIUM,
    //   HIGH
    // }
    // You can access enum constants with the dot syntax:

    // Level myVar = Level.MEDIUM;

    //         Java User Input
    // The Scanner class is used to get user input, and it is found in the java.util package.

    // To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

    // Example
    // import java.util.Scanner;  // Import the Scanner class

    // class Main {
    //   public static void main(String[] args) {
    //     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    //     System.out.println("Enter username");

    //     String userName = myObj.nextLine();  // Read user input
    //     System.out.println("Username is: " + userName);  // Output user input
    //   }
    // }

    //         Java ArrayList

    // The ArrayList class is a resizable array, which can be found in the java.util package.

    // The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

    // Example
    // Create an ArrayList object called cars that will store strings:

    // import java.util.ArrayList; // import the ArrayList class

    // ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

    // Java LinkedList
    // In the previous chapter, you learned about the ArrayList class. The LinkedList class is almost identical to the ArrayList:

    // Import the LinkedList class
    // import java.util.LinkedList;

    // public class Main {
    //   public static void main(String[] args) {
    //     LinkedList<String> cars = new LinkedList<String>();
    //     cars.add("Volvo");
    //     cars.add("BMW");
    //     cars.add("Ford");
    //     cars.add("Mazda");
    //     System.out.println(cars);
    //   }
    // }


    // ArrayList vs. LinkedList
    // The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

    // The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

    // However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

    // How the ArrayList works
    // The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

    // How the LinkedList works
    // The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

    // LinkedList Methods
    // For many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently:

    // Method	        Description	
    // addFirst()	    Adds an item to the beginning of the list.	
    // addLast()	    Add an item to the end of the list	
    // removeFirst()	Remove an item from the beginning of the list.	
    // removeLast()	    Remove an item from the end of the list	
    // getFirst()	    Get the item at the beginning of the list	
    // getLast()	    Get the item at the end of the list

    //     Java HashMap
    // In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

    // One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:

    //         Java HashSet
    // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

    // Java Iterator
    // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

    // To use an Iterator, you must import it from the java.util package.

    // Getting an Iterator
    // The iterator() method can be used to get an Iterator for any collection:

    //         Java Wrapper Classes
    // Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    // The table below shows the primitive type and the equivalent wrapper class:

    // Primitive Data Type	Wrapper Class
    // byte	                Byte
    // short	            Short
    // int	                Integer
    // long	                Long
    // float	            Float
    // double	            Double
    // boolean	            Boolean
    // char	                Character
    // Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):

    // Creating Wrapper Objects
    // To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:

    // Example
    // public class Main {
    //   public static void main(String[] args) {
    //     Integer myInt = 5;
    //     Double myDouble = 5.99;
    //     Character myChar = 'A';
    //     System.out.println(myInt);
    //     System.out.println(myDouble);
    //     System.out.println(myChar);
    //   }
    // }


    //     Java Exceptions
    // When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

    // When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

    // Java try and catch
    // The try statement allows you to define a block of code to be tested for errors while it is being executed.

    // The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

    // The try and catch keywords come in pairs:

    // Syntax
    // try {
    //   //  Block of code to try
    // }
    // catch(Exception e) {
    //   //  Block of code to handle errors
    // }




    // Testing notes below:
 
    // Day03 is going to be a home blue print 
    
        // Constructor
        public Day03(String model, int sqft) {
            modelName = model;
            squareFeet = sqft;
        }


        // Attributes
        int roofCount = 1;
        String exterior = "brick and mortar";
        String modelName;
        int squareFeet;
        boolean hasGarage;
        String garageVendor;

        // Methods

        public String lightsOn() {
            return "lights on!";
        }   
 
 
    public static void main(String[] args) {
        Day03 carterVI = new Day03("Carter VI", 3850);

        carterVI.garageVendor = "Home Depot";

        System.out.println(carterVI.modelName);
        System.out.println(carterVI.squareFeet);
        System.out.println(carterVI.roofCount);
        System.out.println(carterVI.lightsOn());
        System.out.println(carterVI.hasGarage);
        System.out.println(carterVI.garageVendor);
       


    }

}