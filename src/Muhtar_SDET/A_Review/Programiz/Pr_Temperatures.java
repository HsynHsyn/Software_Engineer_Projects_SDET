package Muhtar_SDET.A_Review.Programiz;

import java.util.Arrays;

public class Pr_Temperatures {
    public static void main(String[] args) {



        System.out.println(Arrays.toString(recordTemperatures(new int[] {32, 34, 28, 29, 31, 33},6 )));

    }

    public static int[] recordTemperatures(int[] temps, int size) {

        int min = temps[0];
        int max = temps[1];

        for (int temp : temps) {
            if (temp < min){
                min = temp;
            }
            if (temp > max){
                max = temp;
            }
        }

        int[] array = {min, max};

        return array;
    }
}

//https://app.programiz.pro/community-challenges/challenge/java-record-temperatures/info

/*
Instructions

Given an array of integers temps representing temperatures,
return a pair of integers where the first integer is the lowest temperature and
 the second integer is the highest temperature.

Example

For this input

temps[] = {32, 34, 28, 29, 31, 33}

size = 6

the result should be:

{28, 34}

Reason: The lowest temperature in the array is 28 and the highest temperature is 34.
 */