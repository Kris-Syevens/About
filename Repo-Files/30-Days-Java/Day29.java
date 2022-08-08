import java.util.Arrays;

// Day 29 of 30


public class Day29 {
    // Notes

    // DESCRIPTION:
    // Write a function that can return the smallest value of an array or the index of that value.
    // The function's 2nd parameter will tell whether it should return the value or the index.

    // Assume the first parameter will always be an array filled with at least 1 number and no
    // duplicates. Assume the second parameter will be a string holding one of two values: 'value'
    // and 'index'.

    // min([1,2,3,4,5], 'value') // => 1
    // min([1,2,3,4,5], 'index') // => 0


    public static int minValueOrIndex(int[] arr, String option) {

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);


        if (option.equals("value")) {
            return sortedArr[0];
        } else if (option.equals("index")) {
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == sortedArr[0]) {
                    index = i;
                }
            }

            return index;
        } else {
            return 0;
        }

    }

    // Testing notes below:
    public static void main(String[] args) {

        int[] testOne = {1, 2, 3, 4, 5}; // 1
        int[] testTwo = {1, 2, 3, 4, 5}; // 0
        int[] testThree = {4, 2, 3, 1, 5}; // 3

        System.out.println(minValueOrIndex(testOne, "value"));
        System.out.println(minValueOrIndex(testTwo, "index"));
        System.out.println(minValueOrIndex(testThree, "index"));

    }

}
