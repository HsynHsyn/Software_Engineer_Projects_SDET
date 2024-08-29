package Preparing.Day25_Arrays_Cont;

import java.util.Random;

public class Task1_RandomArrayNumbers {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i] = rn.nextInt(100));

        }

    }
}

/*
Create an array with 10 elements
Initialize each array element with random values between 0 and 100 but less than 100
Print each array element
 */
