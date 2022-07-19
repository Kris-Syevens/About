// Day 10 of 30


public class Day10 {
    // Notes

    // DESCRIPTION:
    // You ask a small girl,"How old are you?" She always says, "x years old", where x is a random
    // number between 0 and 9.

    // Write a program that returns the girl's age (0-9) as an integer.

    // Assume the test input string is always a valid string. For example, the test input may be "1
    // year old" or "5 years old". The first character in the string is always a number.

    public static String howOld() {

        int random = (int) (Math.random() * 10);

        return String.valueOf(random) + " years old.";

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(howOld());

    }

}
