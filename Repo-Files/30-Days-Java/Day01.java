// Day 1 of 30 


public class Day01 {
    // Notes


    // Every Java should have a matching file name and class name. The naming convention is to Capitalize the the class and file name.
    // The extension for Java files are .java. Once you're ready, you need to compile the code to where the JDK can interpret it down to machine code.
    // In order to allow entry into the application, java looks for the main method as show below the notes.

    //   System.out.println()
    //   Inside the main() method, we can use the println() method to print a line of text to the screen:
    //   System.out.println("Hello World");

    // There is also a print() method, which is similar to println().
    // The only difference is that it does not insert a new line at the end of the output:

    // Double Quotes
    // When you are working with text, it must be wrapped inside double quotations marks "".

    // Java Variables
    // Variables are containers for storing data values.

    // In Java, there are different types of variables, for example:

    // String - stores text, such as "Hello". String values are surrounded by double quotes
    // int - stores integers (whole numbers), without decimals, such as 123 or -123
    // float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    // char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    // boolean - stores values with two states: true or false

    // To create a variable, you must specify the type and assign it a value:

    // You can also declare a variable without assigning the value, and assign the value later:

    
    // You can string along different variables or "concat" them utilizing the "+" symbol.
    
    // VARIABLES
    
    // The general rules for naming variables are:
    
    // Names can contain letters, digits, underscores, and dollar signs
    // Names must begin with a letter
    // Names should start with a lowercase letter and it cannot contain whitespace
    // Names can also begin with $ and _ (but we will not use it in this tutorial)
    // Names are case sensitive ("myVar" and "myvar" are different variables)
    // Reserved words (like Java keywords, such as int or boolean) cannot be used as names
    
    // Java Data Types
    
    // int myNum = 5;
    // float myFloatNum = 5.99f;
    // char myLetter = 'D';
    // boolean myBool = true;
    // String myText = "Hello";
    
    // Data types are divided into two groups:

    // Primitive data types - includes byte, short, int, long, float, double, boolean and char
    // Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

    // Numbers
    // Primitive number types are divided into two groups:

    // Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

    // Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

    // Byte
    // The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

    // Short
    // The short data type can store whole numbers from -32768 to 32767:

    // Int
    // The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

    // Long
    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

    // Floating Point Types
    // You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.    

    // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:

    // Scientific Numbers
    // A floating point number can also be a scientific number with an "e" to indicate the power of 10:
    
    // Java has a boolean data type, which can only take the values true or false:

    // Non-Primitive Data Types
    // Non-primitive data types are called reference types because they refer to objects.

    // The main difference between primitive and non-primitive data types are:

    // Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
    // Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
    // A primitive type has always a value, while non-primitive types can be null.
    // A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
    // The size of a primitive type depends on the data type, while non-primitive types have all the same size.
    // Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.

    // Java Type Casting
    // Type casting is when you assign a value of one primitive data type to another type.

    // In Java, there are two types of casting:

    // Widening Casting (automatically) - converting a smaller type to a larger type size
    // byte -> short -> char -> int -> long -> float -> double

    // Narrowing Casting (manually) - converting a larger type to a smaller size type
    // double -> float -> long -> int -> char -> short -> byte



    // Testing notes below:
    public static void main(String[] args) {

        int age = 34;
        String name = "Kris";

        int birthMonth;

        birthMonth = 12;


        System.out.println("Hello World");
        System.out.print("Hello World 2");
        System.out.print("Hello World 3");
        System.out.println("Hello World 4 ");

        System.out.println(age);
        System.out.println(name);
        System.out.println(birthMonth);

        System.out.println("Hello my name is " + name + ". I am " + age + " years old.");

        float pi = 3.14f;

        boolean isMale = true;

        char firstNameInitial = 'K';

        double truncPi = pi;

        long earthAge = age;

        








        

        
    }

}