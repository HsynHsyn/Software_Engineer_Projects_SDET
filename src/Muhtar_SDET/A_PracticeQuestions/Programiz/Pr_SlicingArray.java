package Muhtar_SDET.A_PracticeQuestions.CodingBat;

import java.util.Arrays;

public class Pr_SlicingArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sliceArray(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        // Arrays.toString(sliceArray(arr,startIdx, endIdx) , it is supposed to using like this because return type is array

    }

    public static int[] sliceArray(int[] arr, int startIdx, int endIdx) {

        int[] arr1 = new int[endIdx-startIdx +1]; // it is taken between int startIdx and int endIdx

        for (int i = 0; i < arr1.length; i++) {

            arr1[i]  = arr [startIdx + i];

        }


        return arr1;
    }
}

/*
import java.util.Arrays;

public class ArraySlice {
    public static int[] sliceArray(int[] arr, int startIdx, int endIdx) {

        return Arrays.copyOfRange(arr, startIdx, endIdx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int startIdx = 1;
        int endIdx = 3;

        int[] slicedArray = sliceArray(arr, startIdx, endIdx);
        System.out.println(Arrays.toString(slicedArray)); // output: [2, 3, 4]
    }
}

 */