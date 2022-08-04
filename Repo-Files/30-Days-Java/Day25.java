// Day 25 of 30

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day25 {
    // Notes

    // DESCRIPTION:
    // In this Kata, you will be given a string and your task will be to return a list of ints
    // detailing the count of uppercase letters, lowercase, numbers and special characters, as
    // follows.

    // Solve("*'&ABCDabcde12345") = [4,5,5,3].
    // --the order is: uppercase letters, lowercase, numbers and special characters.
    // More examples in the test cases.

    // Good luck!

    public static int[] specialCounter(String str) {

        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int specCount = 0;

        Pattern pattern1 = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Pattern pattern3 = Pattern.compile("[0-9]");
        Pattern pattern4 = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!-]");

        String[] arr = str.split("");


        for (int i = 0; i < arr.length; i++) {

            Matcher upperMatcher = pattern1.matcher(arr[i]);
            Matcher lowerMatcher = pattern2.matcher(arr[i]);
            Matcher numMatcher = pattern3.matcher(arr[i]);
            Matcher specMatcher = pattern4.matcher(arr[i]);

            boolean upperMatch = upperMatcher.find();
            boolean lowerMatch = lowerMatcher.find();
            boolean numMatch = numMatcher.find();
            boolean specMatch = specMatcher.find();

            if (upperMatch) {
                upperCount++;
            } else if (lowerMatch) {
                lowerCount++;
            } else if (numMatch) {
                numCount++;
            } else if (specMatch) {
                specCount++;
            } else
                continue;

        }

        int[] finalArr = {upperCount, lowerCount, numCount, specCount};

        return finalArr;

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(Arrays.toString(specialCounter("*'&ABCDabcde12345"))); // [4,5,5,3]

    }

}
