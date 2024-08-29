package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // we know the iteration number and use for loop

        int min = 2147338648; // this is minimum int number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num < min) { // if the user entered entry is less than the current max number that we have
                min = num; // then user entered number should be the minimum number
            }

        }
        System.out.println("min = " + min);
        input.close();
    }
}

