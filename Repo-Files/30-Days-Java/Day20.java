import java.util.Arrays;

// Day 20 of 30


public class Day20 {
    // Notes

    // DESCRIPTION:
    // You are given an odd-length array of integers, in which all of them are the same, except for
    // one single number.

    // Complete the method which accepts such an array, and returns that single different number.

    // The input array will always be valid! (odd-length >= 3)

    // Examples
    // [1, 1, 2] ==> 2
    // [17, 17, 3, 17, 17, 17, 17] ==> 3

    public static int oddOneOut(int[] arr) {

        int[] newArr = arr;
        Arrays.sort(newArr);

        if (arr.length < 3) {
            return 0;
        }

        if (newArr[0] == newArr[1]) {
            return newArr[newArr.length - 1];
        } else
            return newArr[0];


    }

    // Testing notes below:
    public static void main(String[] args) {

        int[] testOne = {1, 1, 2};
        int[] testTwo = {17, 17, 3, 17, 17, 17, 17};
        int[] testThree = {17, 17};
        int[] testFour = {17};
        int[] testFive = {};

        System.out.println(oddOneOut(testOne)); // 2
        System.out.println(oddOneOut(testTwo)); // 3
        System.out.println(oddOneOut(testThree)); // 0
        System.out.println(oddOneOut(testFour)); // 0
        System.out.println(oddOneOut(testFive)); // 0

    }

}
