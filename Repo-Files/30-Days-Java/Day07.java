// Day 7 of 30


public class Day07 {
    // Notes

    // DESCRIPTION:
    // Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as
    // an integer number.

    // For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the
    // second quarter; and month 11 (November), is part of the fourth quarter.

    // Testing notes below:

    public static int whichQuarter(int month) {
        if (month >= 1 && month <= 3) {
            return 1;
        } else if (month >= 4 && month <= 6) {
            return 2;
        } else if (month >= 7 && month <= 9) {
            return 3;
        } else if (month >= 10 && month <= 12) {
            return 4;
        } else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(whichQuarter(2)); // 1 or First Quarter
        System.out.println(whichQuarter(6)); // 2 or Second Quarter
        System.out.println(whichQuarter(11)); // 4 or Fourth Quarter

    }

}
