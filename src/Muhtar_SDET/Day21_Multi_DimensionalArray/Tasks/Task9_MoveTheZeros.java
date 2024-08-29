package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Task9_MoveTheZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array); // sorted for descending all elements the smallest to the largest

        int[] reverseArray = new int[array.length]; // reversed array

        for (int each : array){
            for (int i = array.length - 1, k=0; i >= 0; i--, k++) {
                reverseArray[k] = array[i];

            }

        }
        System.out.println(Arrays.toString(reverseArray));

    }
}



/*
Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */