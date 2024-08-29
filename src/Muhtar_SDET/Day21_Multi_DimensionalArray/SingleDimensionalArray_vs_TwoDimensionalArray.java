package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {
        /*
        int[] arr1 = new int[10]; // The elements of this array are primitive types (int),
                                     so each element will be 0.
        int[][] arr2 = new int[10][]; // The elements of this array are reference types (inner arrays),
                                       so each element will be null.
         */

        int[] arr1D = new int[10];

        System.out.println(Arrays.toString(arr1D)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] it is

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,7,8,5,10};
        int[] arr3 = {11,22,33,44,55,66};
        int[] arr4 = {88,99,665,9952,33,22,};
        int[] arr5 = {1,20,30,38,45,28};

        int[][] arr2D = new int[5][]; // index : 0 ~ 4 // [null, null, null, null, null] because this is object
        System.out.println(Arrays.deepToString(arr2D));

        arr2D[0] = arr1; // contains 1D array, not contains element (10,25 etc.)
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        System.out.println(Arrays.deepToString(arr2D));

    }
}
