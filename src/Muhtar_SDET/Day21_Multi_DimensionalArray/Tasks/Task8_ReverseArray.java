package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Arrays;

public class Task8_ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,8,7,8};
        int[] reversedArray = new int[array.length]; // should create reversedArray and determine reversedArray length

        for (int i = array.length-1, k = 0; i >= 0; i--, k++) { // assign new variable name and initialize

           reversedArray[k] =array[i]; // i is decrement and k is increment

        }

        System.out.println("Reversed Array = " + Arrays.toString(reversedArray));
    }
}
/*
Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */