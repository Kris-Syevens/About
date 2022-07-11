// Day 2 of 30 


public class Day02 {
    // Notes

    // Java Operators
    // Operators are used to perform operations on variables and values.

    // In the example below, we use the + operator to add together two values

    // Arithmetic Operators
    // Arithmetic operators are used to perform common mathematical operations.

    // Operator	    Name	        Description	                            Example	
    // +	        Addition	    Adds together two values	            x + y	
    // -	        Subtraction	    Subtracts one value from another	    x - y	
    // *	        Multiplication	Multiplies two values	                x * y	
    // /	        Division	    Divides one value by another	        x / y	
    // %	        Modulus	        Returns the division remainder	        x % y	
    // ++	        Increment	    Increases the value of a variable by 1	++x	
    // --	        Decrement	    Decreases the value of a variable by 1	--x	

    // Java Assignment Operators
    // Assignment operators are used to assign values to variables.

    // In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:

    // A list of all assignment operators:

    // Operator	Example	    Same As	
    // =	    x = 5	    x = 5	
    // +=	    x += 3	    x = x + 3	
    // -=	    x -= 3	    x = x - 3	
    // *=	    x *= 3	    x = x * 3	
    // /=	    x /= 3	    x = x / 3	
    // %=	    x %= 3	    x = x % 3	
    // &=	    x &= 3	    x = x & 3	
    // |=	    x |= 3	    x = x | 3	
    // ^=	    x ^= 3	    x = x ^ 3	
    // >>=	    x >>= 3	    x = x >> 3	
    // <<=	    x <<= 3	    x = x << 3

    // Java Comparison Operators
    // Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

    // The return value of a comparison is either true or false. These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.

    // In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

    // Operator	Name	                    Example	
    // ==	    Equal to	                x == y	
    // !=	    Not equal	                x != y	
    // >	    Greater than	            x > y	
    // <	    Less than	                x < y	
    // >=	    Greater than or equal to	x >= y	
    // <=	    Less than or equal to	    x <= y

    // Java Logical Operators
    // You can also test for true or false values with logical operators.

    // Logical operators are used to determine the logic between variables or values:

    // Operator	    Name	        Description	                                            Example	
    // && 	        Logical and	    Returns true if both statements are true	            x < 5 &&  x < 10	
    // || 	        Logical or	    Returns true if one of the statements is true	        x < 5 || x < 4	
    // !	        Logical not	    Reverse the result, returns false if the result is true !(x < 5 && x < 10)

    // Java Strings
    // Strings are used for storing text.

    // A String variable contains a collection of characters surrounded by double quotes:

    // String Length
    // A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

    // All Java Object String Methods
    // The String class has a set of built-in methods that you can use on strings.

    // Method	                Description	                                                                                                            Return Type
    // charAt()	                Returns the character at the specified index (position)	                                                                char
    // codePointAt()	        Returns the Unicode of the character at the specified index	                                                            int
    // codePointBefore()	    Returns the Unicode of the character before the specified index	                                                        int
    // codePointCount()	        Returns the number of Unicode values found in a string.	                                                                int
    // compareTo()	            Compares two strings lexicographically	                                                                                int
    // compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	                                                    int
    // concat()	                Appends a string to the end of another string	                                                                        String
    // contains()	            Checks whether a string contains a sequence of characters	                                                            boolean
    // contentEquals()	        Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
    // copyValueOf()	        Returns a String that represents the characters of the character array	                                                String
    // endsWith()	            Checks whether a string ends with the specified character(s)	                                                        boolean
    // equals()	                Compares two strings. Returns true if the strings are equal, and false if not	                                        boolean
    // equalsIgnoreCase()	    Compares two strings, ignoring case considerations	                                                                    boolean
    // format()	                Returns a formatted string using the specified locale, format string, and arguments	                                    String
    // getBytes()	            Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	        byte[]
    // getChars()	            Copies characters from a string to an array of chars	                                                                void
    // hashCode()	            Returns the hash code of a string	                                                                                    int
    // indexOf()	            Returns the position of the first found occurrence of specified characters in a string	                                int
    // intern()	                Returns the canonical representation for the string object	                                                            String
    // isEmpty()	            Checks whether a string is empty or not	                                                                                boolean
    // lastIndexOf()	        Returns the position of the last found occurrence of specified characters in a string	                                int
    // length()	                Returns the length of a specified string	                                                                            int
    // matches()	            Searches a string for a match against a regular expression, and returns the matches	                                    boolean
    // offsetByCodePoints()	    Returns the index within this String that is offset from the given index by codePointOffset code points	                int
    // regionMatches()	        Tests if two string regions are equal	                                                                                boolean
    // replace()	            Searches a string for a specified value, and returns a new string where the specified values are replaced	            String
    // replaceFirst()	        Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	    String
    // replaceAll()	            Replaces each substring of this string that matches the given regular expression with the given replacement	            String
    // split()	                Splits a string into an array of substrings	                                                                            String[]
    // startsWith()	            Checks whether a string starts with specified characters	                                                            boolean
    // subSequence()	        Returns a new character sequence that is a subsequence of this sequence	                                                CharSequence
    // substring()	            Returns a new string which is the substring of a specified string	                                                    String
    // toCharArray()	        Converts this string to a new character array	                                                                        char[]
    // toLowerCase()	        Converts a string to lower case letters	                                                                                String
    // toString()	            Returns the value of a String object	                                                                                String
    // toUpperCase()	        Converts a string to upper case letters	                                                                                String
    // trim()	                Removes whitespace from both ends of a string	                                                                        String
    // valueOf()	            Returns the string representation of the specified value	                                                            String

    // If you add a number and a string, the result will be a string concatenation:

    // Java Math

    // The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

    //     All Math Methods
    // A list of all Math methods can be found in the table below:

    // Method	            Description	                                                                                                    Return Type
    // abs(x)	            Returns the absolute value of x	                                                                                double|float|int|long
    // acos(x)	            Returns the arccosine of x, in radians	                                                                        double
    // asin(x)	            Returns the arcsine of x, in radians	                                                                        double
    // atan(x)	            Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	                                double
    // atan2(y,x)	        Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
    // cbrt(x)	            Returns the cube root of x	                                                                                    double
    // ceil(x)	            Returns the value of x rounded up to its nearest integer	                                                    double
    // copySign(x, y)	    Returns the first floating point x with the sign of the second floating point y	                                double
    // cos(x)	            Returns the cosine of x (x is in radians)	                                                                    double
    // cosh(x)	            Returns the hyperbolic cosine of a double value	                                                                double
    // exp(x)	            Returns the value of Ex	                                                                                        double
    // expm1(x)	            Returns ex -1	                                                                                                double
    // floor(x)	            Returns the value of x rounded down to its nearest integer	                                                    double
    // getExponent(x)	    Returns the unbiased exponent used in x	                                                                        int
    // hypot(x, y)	        Returns sqrt(x2 +y2) without intermediate overflow or underflow	                                                double
    // IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	                            double
    // log(x)	            Returns the natural logarithm (base E) of x	                                                                    double
    // log10(x)	            Returns the base 10 logarithm of x	                                                                            double
    // log1p(x)	            Returns the natural logarithm (base E) of the sum of x and 1	                                                double
    // max(x, y)	        Returns the number with the highest value	                                                                    double|float|int|long
    // min(x, y)	        Returns the number with the lowest value	                                                                    double|float|int|long
    // nextAfter(x, y)	    Returns the floating point number adjacent to x in the direction of y	                                        double|float
    // nextUp(x)	        Returns the floating point value adjacent to x in the direction of positive infinity	                        double|float
    // pow(x, y)	        Returns the value of x to the power of y	                                                                    double
    // random()	            Returns a random number between 0 and 1	                                                                        double
    // round(x)	            Returns the value of x rounded to its nearest integer	                                                        int
    // rint(x)	            Returns the double value that is closest to x and equal to a mathematical integer	                            double
    // signum(x)	        Returns the sign of x	                                                                                        double
    // sin(x)	            Returns the sine of x (x is in radians)	                                                                        double
    // sinh(x)	            Returns the hyperbolic sine of a double value	                                                                double
    // sqrt(x)	            Returns the square root of x	                                                                                double
    // tan(x)	            Returns the tangent of an angle	                                                                                double
    // tanh(x)	            Returns the hyperbolic tangent of a double value	                                                            double
    // toDegrees(x)	        Converts an angle measured in radians to an approx. equivalent angle measured in degrees	                    double
    // toRadians(x)	        Converts an angle measured in degrees to an approx. angle measured in radians	                                double
    // ulp(x)	            Returns the size of the unit of least precision (ulp) of x	                                                    double|float
    
    // Note: All Math methods are static.

    //         Java Conditions and If Statements
    // You already know that Java supports the usual logical conditions from mathematics:

    // Less than: a < b
    // Less than or equal to: a <= b
    // Greater than: a > b
    // Greater than or equal to: a >= b
    // Equal to a == b
    // Not Equal to: a != b
    // You can use these conditions to perform different actions for different decisions.

    // Java has the following conditional statements:

    // Use if to specify a block of code to be executed, if a specified condition is true
    // Use else to specify a block of code to be executed, if the same condition is false
    // Use else if to specify a new condition to test, if the first condition is false
    // Use switch to specify many alternative blocks of code to be executed

    // Java Short Hand If...Else (Ternary Operator)

    //     Java Switch Statements
    // Instead of writing many if..else statements, you can use the switch statement.

    // The switch statement selects one of many code blocks to be executed:

    // The break Keyword
    // When Java reaches a break keyword, it breaks out of the switch block.

    // This will stop the execution of more code and case testing inside the block.

    // When a match is found, and the job is done, it's time for a break. There is no need for more testing.

    // The default Keyword
    // The default keyword specifies some code to run if there is no case match

    // The default Keyword
    // The default keyword specifies some code to run if there is no case match

    //     Java For Loop
    // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

    // Syntax
    // for (statement 1; statement 2; statement 3) {
    //   // code block to be executed
    // }

    //      For-Each Loop
    // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

    // Syntax
    // for (type variableName : arrayName) {
    //   // code block to be executed
    // }

    //     Java Break
    // You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

    // The break statement can also be used to jump out of a loop.

        // Java Continue
    // The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

    // Java Arrays
    // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    // To declare an array, define the variable type with square brackets:




    // Testing notes below:
    public static void main(String[] args) {

        int ageTwentyTwo = 2022 - 1988;
        int currentYear = 2022;
        String sentence = "The year is ";
        System.out.println(ageTwentyTwo);
        System.out.println(sentence + currentYear);

        System.out.println(7 == 8); // false
        System.out.println(7 > 8); // false
        System.out.println(7 < 8); // true
        System.out.println(7 != 8); // true
     
        String name = "Kristofer Syevens";

        System.out.println(name.length()); // built in java method on the String object. 
        System.out.println(name.toLowerCase()); // built in java method on the String object. 
        System.out.println(name.toUpperCase()); // built in java method on the String object. 

        String[] nameSplit = name.split(" ");
        System.out.println(nameSplit[0]); // built in java method on the String object. 
        System.out.println(nameSplit[1]); // built in java method on the String object. 

        if(7 > 5) {
            System.out.println("7 is greater than 5!");
        } 

       String result =  (7 > 5) ? "7 is greater than 5" : "7 is not greater!";

       System.out.println(result);

        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }


        int count = 10;

        while(count > 0) {
            System.out.println(count);
            count--;
        }

       

        String[] syevensFamily2 = {"Kris", "Bella", "Joey", "Gene", "AraBella", "Evan"};

        
    }
}