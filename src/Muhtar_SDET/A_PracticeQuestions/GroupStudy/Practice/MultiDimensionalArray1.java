package Muhtar_SDET.A_PracticeQuestions.GroupStudy.Practice;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {


        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {9000,2100};

        System.out.println("---------------------");
        //                     0     1               2           3
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}, {9000,2100}};
                        // 0-1-2        0-1-2-3-4
        System.out.println(arr2D.length); // 4
        System.out.println((arr2D[0][1]));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("-----------------------------------------------------------------");



    }
}
