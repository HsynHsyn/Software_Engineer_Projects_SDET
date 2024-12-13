package Muhtar_SDET.A_PracticeQuestions.Programiz;

import java.util.Arrays;

public class Pr_CircularShift {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotate(new int[] {13, 24, 35, 46})));

    }

    public static int[] rotate(int[] arr) {

        int[] arr1 = new int[arr.length];
        arr1[0] = arr[arr.length-1];
        for (int i = 0 , j = 1; i < arr.length-1; i++, j ++) {

            arr1[j] = arr[i];

        }

        return arr1;
    }

}

/*
public static int[] rotate(int[] arr) {
        List<Integer> rotateList = new ArrayList<Integer>();
        int last = arr[arr.length - 1];
        rotateList.add(last);
        for(int i = 0; i < arr.length - 1; i++){
            rotateList.add(arr[i]);
        }

        int[] rotateArr = new int[rotateList.size()];
        for(int i = 0; i < rotateArr.length; i++){
            rotateArr[i] = rotateList.get(i);
        }
        return rotateArr;
    }
 */ //second solution

/*
Write a function to perform a circular shift on an array.

Perform a circular shift on the array arr for n times and return the updated array.

What is a circular shift?

Given the array arr[] = {13, 24, 35, 46}, what is the result after one circular shift?
output: arr[] = {46, 13, 24, 35}
 */ // question
