// Day 28 of 30


public class Day28 {
    // Notes

    // DESCRIPTION:
    // You will be given an array and a limit value. You must check that all values in the array are
    // below or equal to the limit value. If they are, return true. Else, return false.

    // You can assume all values in the array are numbers.

    public static boolean arrayLimiter(int[] arr, int limiter) {

        boolean allAtLimit = true;

        for (int i : arr) {
            if (i <= limiter) {
                continue;
            } else {
                allAtLimit = false;
            }
        }

        return allAtLimit;

    }

    // Testing notes below:
    public static void main(String[] args) {

        int[] testOne = {1, 2, 3, 4, 5};
        int[] testTwo = {1, 2, 3, 4, 5, 6};

        System.out.println(arrayLimiter(testOne, 5)); // true
        System.out.println(arrayLimiter(testTwo, 5)); // false

    }

}
