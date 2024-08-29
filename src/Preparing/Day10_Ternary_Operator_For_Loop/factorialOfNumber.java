/* Question:
Write a program that calculates the factorial of a number provided by the user. The program should follow these steps:

Prompt the user to enter a positive integer.
Use a for loop to calculate the factorial of that number.
Print the result to the console. */

package Preparing.Day10_Ternary_Operator_For_Loop;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number=sc.nextInt();

        int fact=1; // Initialization
        for (int i=1;i<=number;i++){
            fact=1;
            for (int j=1;j<=i;j++){
                fact=fact*j; // Multiply factorial by i
            }
        }
        System.out.println("Factorial of " +number+ " is " + fact);
    }
}

