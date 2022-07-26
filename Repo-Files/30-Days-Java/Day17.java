import java.util.Arrays;

// Day 17 of 30


public class Day17 {
    // Notes

    // DESCRIPTION:
    // Given an array of integers.

    // Return an array, where the first element is the count of positives numbers and the second
    // element is sum of negative numbers. 0 is neither positive nor negative.

    // If the input is an empty array or is null, return an empty array.

    // Example
    // For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10,
    // -65].

    public static String countAndSum(int[] arr) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            } else if (arr[i] < 0) {
                sum += arr[i];
            } else
                continue;
        }

        int[] newArr = new int[2];
        newArr[0] = count;
        newArr[1] = sum;

        return Arrays.toString(newArr);

    }

    // Testing notes below:
    public static void main(String[] args) {

        int[] testOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        System.out.println(countAndSum(testOne)); // {10, -65}

    }

}
