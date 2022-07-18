// Day 9 of 30


public class Day09 {
    // Notes

    // DESCRIPTION:
    // You were camping with your friends far away from home, but when it's time to go back, you
    // realize that your fuel is running out and the nearest pump is 50 miles away! You know that on
    // average, your car runs on about 25 miles per gallon. There are 2 gallons left.

    // Considering these factors, write a function that tells you if it is possible to get to the
    // pump or not.

    // Function should return true if it is possible and false if not.


    public static Boolean willWeMakeIt(int distanceToPump, int mpg, int remainingGallons) {

        if (remainingGallons * mpg >= distanceToPump) {
            return true;
        } else
            return false;

    }


    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(willWeMakeIt(50, 25, 2)); // true
        System.out.println(willWeMakeIt(50, 25, 1)); // false
        System.out.println(willWeMakeIt(76, 25, 3)); // false


    }

}
