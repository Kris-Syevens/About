// Day 8 of 30


public class Day08 {
    // Notes

    // DESCRIPTION:
    // Write function RemoveExclamationMarks which removes all exclamation marks from a given
    // string.

    public static String removeExclamations(String Str) {

        String newStr = Str.replace("!", "");
        return newStr;

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(removeExclamations("Hello World!!!!")); // Hello World

    }

}
