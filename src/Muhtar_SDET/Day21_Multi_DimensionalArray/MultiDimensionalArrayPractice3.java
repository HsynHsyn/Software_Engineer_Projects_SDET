package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D = { {{1,2},{3,4,5}},  {{6,7,8,9},{10,11,13,12},{3,4,5}},    {{15,25, 13,44,65}} }; // index: 0 ~ 2
        int[][][] arr3D1 = { {{1,2},{3,4,5}},  {{6,7,8,9},{10,11,13,12},{3,4,5}},    {{15,25, 13,44,65}} }; // index: 0 ~ 2
        int[][][] arr3D2 = { {{1,2},{3,4,5}},  {{6,7,8,9},{10,11,13,12},{3,4,5}},    {{15,25, 13,44,65}} }; // index: 0 ~ 2

        int[][][][] arr4D= {arr3D, arr3D1, arr3D2 };

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        //System.out.println(eachElement);
                    }

                }
                
            }
            
        }

        System.out.println(Arrays.deepToString(arr3D2));
    }
}
