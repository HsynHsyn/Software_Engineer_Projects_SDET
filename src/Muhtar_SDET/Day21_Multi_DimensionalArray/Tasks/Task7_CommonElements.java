package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

public class Task7_CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5,9};
        int[] arr2 = {4, 5, 6, 7, 8 , 3, 9 };


        for (int each : arr1) { // picking all elements from arr1

            for (int i = 0; i < arr2.length; i++) { // i < arr2.length, must be arr2 length for reaching all arr2 elements
                if (each == arr2 [i]){ // if each equal some arr1 elements we can print it
                    System.out.println(each);
                }
            }

        }
    }
}
/*
Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5
 */