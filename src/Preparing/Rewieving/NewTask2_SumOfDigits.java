/*
 Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */

package Preparing.Rewieving;

import java.util.Scanner;

public class NewTask2_SumOfDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prompt the user to input an integer
        System.out.println("Enter the integer number: ");

    // Read the integer from the user
        int number = sc.nextInt();

    // Calculate and display the sum of the digits
        System.out.println(" The sum of the digits is: " + sumDigits(number));

    }

    private static int sumDigits(int number) {
        int sum = 0;
    // Calculate the sum of the digits
        while (number !=0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}