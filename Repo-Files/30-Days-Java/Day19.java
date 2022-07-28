// Day 19 of 30


public class Day19 {
    // Notes

    // DESCRIPTION:
    // Write a function which calculates the average of the numbers in a given list.

    // Note: Empty arrays should return 0.

    public static float calcAverage(int[] arr) {

        int sum = 0;


        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }


            return (float) sum / arr.length;
        }


    }

    // Testing notes below:
    public static void main(String[] args) {

        int[] testOne = {10, 10, 10, 10, 10};
        int[] testTwo = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] testThree = {2, 7, 14, 3, 5, 8};

        System.out.println(calcAverage(testOne)); // 10.0
        System.out.println(calcAverage(testTwo)); // 10.0
        System.out.println(calcAverage(testThree)); // 6.5

    }

}
