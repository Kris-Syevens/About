// Day 6 of 30
import java.text.NumberFormat;
import java.util.Scanner;

public class Day06 {

    // Created a simple mortgage calculator


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = (scanner.nextDouble() / 100) / 12;
        System.out.print("Period (Years): ");
        int years = scanner.nextInt() * 12;
        double numerator = (rate * Math.pow(1 + rate, years));
        double denominator = Math.pow(1 + rate, years) - 1;

        double mortgage = principal * (numerator / denominator);


        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));



    }



}
