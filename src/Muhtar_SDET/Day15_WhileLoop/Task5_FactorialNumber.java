package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class Task5_FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // it is used to get input from user
        System.out.println("Enter the number : ");
        int number = input.nextInt(); // it has to be int

        input.close(); // to close scanner class
        int factorial = 1; // it is used to start 1 because when factorial starts 0 result will be 0 all the time
        for (int i = 1; i <= number; i++) { // to reach the given number

            factorial *= i; // formula of factorial

        }
        System.out.println("factorial = " + factorial);




    }
}
/*
Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
