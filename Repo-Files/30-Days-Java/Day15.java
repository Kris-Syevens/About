// Day 15 of 30


public class Day15 {
    // Notes

    // DESCRIPTION:
    // Complete the solution so that it reverses the string passed into it.

    // 'world' => 'dlrow'
    // 'word' => 'drow'


    public static String reverseMe(String str) {
        String finalStr = "";

        for (int i = str.split("").length - 1; i >= 0; i--) {
            finalStr += str.split("")[i];
        }

        return finalStr;

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(reverseMe("kristofer"));
        System.out.println(reverseMe("syevens"));

    }

}
