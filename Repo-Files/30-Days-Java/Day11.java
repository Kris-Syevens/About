// Day 11 of 30


public class Day11 {
    // Notes

    // DESCRIPTION:
    // You are given two interior angles (in degrees) of a triangle.

    // Write a function to return the 3rd.

    // Note: only positive integers will be tested.

    public static int thirdAngle(int a, int b) {

        return 180 - (a + b);

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(thirdAngle(30, 90)); // 60
        System.out.println(thirdAngle(130, 20)); // 30
        System.out.println(thirdAngle(60, 60)); // 60



    }

}
