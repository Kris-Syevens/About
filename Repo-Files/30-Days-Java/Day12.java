// Day 12 of 30


public class Day12 {
    // Notes

    // DESCRIPTION:
    // Write function bmi that calculates body mass index (bmi = weight / height2).

    // if bmi <= 18.5 return "Underweight"

    // if bmi <= 25.0 return "Normal"

    // if bmi <= 30.0 return "Overweight"

    // if bmi > 30 return "Obese"

    public static String bmiCalculatorUS(float weightPounds, float heightInches) {

        float bmi = weightPounds / (float) Math.pow(heightInches, 2) * 703;

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi > 18.5 && bmi <= 25) {
            return "Normal";
        } else if (bmi > 25 && bmi <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }

    // Testing notes below:
    public static void main(String[] args) {

        System.out.println(bmiCalculatorUS(235, 68)); // Obese

    }

}
