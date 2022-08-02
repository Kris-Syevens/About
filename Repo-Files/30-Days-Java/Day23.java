// Day 23 of 30


public class Day23 {
    // Notes

    // DESCRIPTION:
    // Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

    // For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and
    // 12 is 1.

    // Note: The function accepts an integer and returns an integer

    public static int squareEveryDigit(int num) {

        String finalNum = "";
        String[] numArr = String.valueOf(num).split("");

        for (int i = 0; i < numArr.length; i++) {

            finalNum += (int) Math.pow(Integer.parseInt(numArr[i]), 2);

        }


        return Integer.parseInt(finalNum);

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(squareEveryDigit(9119)); // 811181
        System.out.println(squareEveryDigit(222)); // 444
        System.out.println(squareEveryDigit(777)); // 494949

    }

}
