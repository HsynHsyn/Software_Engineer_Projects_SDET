package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArrays {
    public static void main(String[] args) {
    // index of elements: 0 1 2        0 1 2 3 4
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
    //index of 1D Array        0        1                2

        //powerful
        for (int i = 0; i < arr2D.length; i++) { //  index of 1D Array in arr2D
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString( each1D ) );

            for (int j = 0; j < each1D.length; j++) { // index of elements in each 1D array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("---------------------------------------------------------------");

        //short
        for ( int[] each1DArray: arr2D){
            System.out.println(each1DArray);

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }
        System.out.println("---------------------------------------------------------------");
        //reverse // shortcut arr2D.forr
        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }

        System.out.println("---------------------------------------------------------------");
            // shortcut arr2D.for (for each loop)
            for (int[] each1DArray : arr2D) {
                System.out.println(each1DArray);

            }

        }

        }


    }

