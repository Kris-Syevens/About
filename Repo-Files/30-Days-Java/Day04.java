// Day 4 of 30 


public class Day04 {

    public static int stringToNumber(String str) {
    //TODO: Convert str into a number
    return Integer.parseInt(str);
    }
 
    public static void main(String[] args) {
        System.out.println(stringToNumber("1207"));
        System.out.println(stringToNumber("0608"));
        System.out.println(stringToNumber("1105"));
    }

}