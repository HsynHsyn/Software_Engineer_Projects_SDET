package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class Task10_CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount of your cents : ");
        int cents = input.nextInt();

        int dollars = cents / 100;
        int reinder = cents % 100;

        System.out.println(cents + " cents equal to : " + dollars + " dollars and " + reinder + " cents");

    }
}

/*
Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */
