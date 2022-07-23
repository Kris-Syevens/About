// Day 14 of 30


public class Day14 {
    // Notes

    // DESCRIPTION:
    // Timmy & Sarah think they are in love, but around where they live, they will only know once
    // they pick a flower each. If one of the flowers has an even number of petals and the other has
    // an odd number of petals it means they are in love.

    // Write a function that will take the number of petals of each flower and return true if they
    // are in love and false if they aren't.

    public static Boolean inLoveOrNot(int a, int b) {

        if ((a + b) % 2 == 0) {
            return false;

        } else
            return true;

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(inLoveOrNot(2, 3)); // Love
        System.out.println(inLoveOrNot(2, 6)); // Not in Love

    }

}
