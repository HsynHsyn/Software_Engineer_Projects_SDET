package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class Task4_SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // asking number to calculate

        System.out.println("Enter the number: ");
        int givenNumber =  input.nextInt(); // it should be int number so it is used nextInt() method

        input.close(); // closing to scanner class
        int sum = 0;   // it is used to initialize
        for (int i = 1; i <= givenNumber ; i++) { // it is used to calculate until reaching givenNumber
            sum +=i;            // it is used to  additional assignment operator adding by 1

        }

        System.out.println("sum = " + sum);


    }
}
/*
Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050

				Example 2:
					    number = 50

				Output:
					  1275
 */