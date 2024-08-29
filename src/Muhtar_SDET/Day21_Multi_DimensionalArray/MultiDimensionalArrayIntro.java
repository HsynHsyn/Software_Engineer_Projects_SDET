package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        // multi dimensional arrays are more than 2 dimensional

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {9000,2100};

        System.out.println("---------------------");

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}, {9000,2100}};
        System.out.println(arr2D.length); // 4

        System.out.println(Arrays.toString(arr2D[0])); // [10, 20, 30]

        System.out.println(( arr2D[2][0] )); // 90
        System.out.println(( arr2D[1][2] )); // 60


    }
}
