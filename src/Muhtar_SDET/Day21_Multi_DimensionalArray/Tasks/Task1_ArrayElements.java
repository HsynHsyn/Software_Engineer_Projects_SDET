package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Task1_ArrayElements {
    public static void main(String[] args) {

        int[] intArray = new int[100];
        int[] intReverseArray = new int[intArray.length]; // reverse array and intArray lengths are equal

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1; // Assign values from 1 to 100 to the indexes of the array.

        }

        for (int i = 0 ; i < intReverseArray.length; i++ ) { // the array elements in a single line in reversed order, separated by spaces.
            intReverseArray[i] = intArray[intArray.length-1-i]; // when intArray index number decreases intReverseArray index increases
        }

        System.out.println(Arrays.toString(intArray)); // 1D arrays print
        System.out.println("*********************************************");

        System.out.println(Arrays.toString(intReverseArray)); // 1D arrays print
        System.out.println("*********************************************");


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 5 == 0) {
                System.out.print(intArray[i] + " "); // print elements
            }
        }

    }
}

/*
second solution

int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
 */


/*
Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */