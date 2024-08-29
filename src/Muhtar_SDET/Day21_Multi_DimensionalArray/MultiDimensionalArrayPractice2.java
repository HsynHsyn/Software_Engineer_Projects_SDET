package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D1 = {{1,2},{3,4,5}};
        int[][] arr2D2 = {{6,7,8,9},{10,11,13,12},{3,4,5}};
        int[][] arr2D3 = {{15,25, 13,44,65}};
        //                     0      1            0           1           2                  0
        int[][][] arr3D = { {{1,2},{3,4,5}},  {{6,7,8,9},{10,11,13,12},{3,4,5}},    {{15,25, 13,44,65}} }; // index: 0 ~ 2
        //      index           0                           1                               2

        //[index of 2D array][index of 1D array][index of elements]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1])); // [[6, 7, 8, 9], [10, 11, 13, 12], [3, 4, 5]]

        System.out.println(Arrays.toString(arr3D[0][1])); // [3, 4, 5]

        System.out.println(Arrays.toString(arr3D[1][0])); // [6, 7, 8, 9]

        System.out.println(arr3D[0][1][1]);// 4

        System.out.println(arr3D[2][0][2]);// 13

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < arr3D.length; i++) { // i: index of number of each 2 dimensional arrays
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) {// j: index of number of each 1 dimensional arrays
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k: index of number of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }
            }

        }

    }
}
