// Day 13 of 30


public class Day13 {
    // Notes

    // DESCRIPTION:
    // Write a function that accepts an integer n and a string s as parameters, and returns a string
    // of s repeated exactly n times.

    // Examples (input -> output)
    // 6, "I" -> "IIIIII"
    // 5, "Hello" -> "HelloHelloHelloHelloHello"


    public static String repeatMe(String str, int n) {

        return str.repeat(n);

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(repeatMe("I", 5));
        System.out.println(repeatMe("Hello", 2));

    }

}
