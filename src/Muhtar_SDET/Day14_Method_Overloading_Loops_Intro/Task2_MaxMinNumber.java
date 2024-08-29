package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

import java.util.Scanner;

public class Task2_MaxMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; // Initialize min to a very large value
        // Get 5 numbers from the user and update the minimum value
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number > max ) {
                max = number;
            }
            if (number < min  ) {
                min = number ;
            }
        }
        // Print the maximum and minimum number

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        }

    }

/*
Write a program that can ask the user enter to enter a number for five times, print the max number and min number
 */