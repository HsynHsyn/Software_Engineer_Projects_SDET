/* ØCreate a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
Feet is the first parameter, inches is the second parameter.
ØYou should validate that the first parameter feet is >=0, and second parameter inches is
>=0 and <=12. Return -1 from the method if either of the above is not true.
ØIf the parameters are valid, then calculate how many centimeters comprise the feet and
inches passed to this method and return that value.
ØCreate a second method of the same name but with only one parameter inches is the
parameter and validate it >=0, return -1 if it is not true. But if it is valid, then calculate how
many feet are in the inches.
ØCall the other overloaded method passing the correct feet and inches calculated so that it
can calculate correctly.
ØHints : Use double for your number datatypes

1 inch = 2.54cm and 1 ft =12 inches */

package Preparing.Day14_Methods_Cont;

public class Task12_CalcFeetAndInchesToCentimeters {

    public static void main(String[] args) {
        // Test the methods
        System.out.println(calcFeetAndInchesToCentimeters(6, 0)); // should return 182.88
        System.out.println(calcFeetAndInchesToCentimeters(7, 5)); // should return 226.06
        System.out.println(calcFeetAndInchesToCentimeters(-10, 1)); // should return -1
        System.out.println(calcFeetAndInchesToCentimeters(6, 13)); // should return -1
        System.out.println(calcFeetAndInchesToCentimeters(100)); // should return 254.0
        System.out.println(calcFeetAndInchesToCentimeters(-10)); // should return -1
    }

    // Method with two parameters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // Validate parameters
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        // Convert feet to inches
        double totalInches = (feet * 12) + inches;
        // Convert inches to centimeters
        double centimeters = totalInches * 2.54;
        return centimeters;
    }

    // Overloaded method with one parameter
    public static double calcFeetAndInchesToCentimeters(double inches) {
        // Validate parameter
        if (inches < 0) {
            return -1;
        }
        // Calculate feet and remaining inches
        double feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        // Call the other method
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}


