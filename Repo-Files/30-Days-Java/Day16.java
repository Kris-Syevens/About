// Day 16 of 30


public class Day16 {
    // Notes

    // DESCRIPTION:
    // It's pretty straightforward. Your goal is to create a function that removes the first and
    // last characters of a string. You're given one parameter, the original string. You don't have
    // to worry with strings with less than two characters.

    public static String removeFirstAndLastChar(String str) {

        return str.substring(1, str.length() - 1);

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(removeFirstAndLastChar("Kristofer")); // ristofe

    }

}
