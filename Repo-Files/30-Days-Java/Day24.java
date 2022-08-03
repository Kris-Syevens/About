// Day 24 of 30


public class Day24 {
    // Notes

    // DESCRIPTION:
    // Create a function args_count, that returns the count of passed arguments

    // args_count(1, 2, 3) -> 3
    // args_count(1, 2, 3, 10) -> 4

    public static int args_count(int... args) {

        return args.length;
    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(args_count(1, 2, 3, 4)); // 4
        System.out.println(args_count(1, 1, 1, 1)); // 4
        System.out.println(args_count(1, 1, 1, 1, 5, 5)); // 6

    }

}
