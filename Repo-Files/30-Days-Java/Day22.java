import java.util.Arrays;

// Day 22 of 30


public class Day22 {
    // Notes

    // DESCRIPTION:
    // In this little assignment you are given a string of space separated numbers, and have to
    // return the highest and lowest number.

    // Examples
    // highAndLow("1 2 3 4 5"); // return "5 1"
    // highAndLow("1 2 -3 4 5"); // return "5 -3"
    // highAndLow("1 9 3 4 -5"); // return "9 -5"
    // Notes
    // All numbers are valid Int32, no need to validate them.
    // There will always be at least one number in the input string.
    // Output string must be two numbers separated by a single space, and highest number is first.

    public static String highestAndLowest(String s) {

        String[] newArr = s.split(" ");

        Arrays.sort(newArr);

        return newArr[newArr.length - 1] + " " + newArr[0];

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(highestAndLowest("1 2 3 4 5")); // "5 1"
        System.out.println(highestAndLowest("1 2 -3 4 5")); // "5 -3"
        System.out.println(highestAndLowest("1 9 3 4 -5")); // "9 -5"

    }

}
