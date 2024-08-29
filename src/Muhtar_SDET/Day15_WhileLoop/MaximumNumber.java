package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // we know the iteration number and use for loop


        int max = -2147338648; // this is minimum int number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num > max) { // if the user entered entry is greater than the current max number that we have
                max = num; // then user entered number should be the maximum number
            }

        }
        System.out.println("max = " + max);
        input.close();
    }
}
/*
Write a program that can ask the user to
enter a number for 5 times and returns the maximum number
 */