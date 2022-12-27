

// Day 26 of 30


public class Day26 {
    // Notes

    // DESCRIPTION:
    // Check to see if a string has the same amount of 'x's and 'o's. The method must return a
    // boolean and be case insensitive. The string can contain any char.

    // Examples input/output:
    // XO("ooxx") => true
    // XO("xooxx") => false
    // XO("ooxXm") => true
    // XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    // XO("zzoo") => false

    public static boolean exesAndOhs(String str) {
        int x = 0;
        int o = 0;

        String[] arr = str.toLowerCase().split("");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("x")) {
                x += 1;
            } else if (arr[i].equals("o")) {
                o += 1;

            }
        }



        if (x == o) {
            return true;
        } else {
            return false;
        }


    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(exesAndOhs("ooxx")); // true
        System.out.println(exesAndOhs("xooxx")); // false
        System.out.println(exesAndOhs("ooxXm")); // true
        System.out.println(exesAndOhs("zpzpzpp")); // true
        System.out.println(exesAndOhs("zzoo")); // false

    }

}
