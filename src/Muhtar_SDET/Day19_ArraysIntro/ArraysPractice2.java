package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];


         /*  for (int i = 0, j = 1; i < arr1.length; i++, j++) { // j = 10 , j+=10 doable

           arr1[i] = j ;

            // System.out.println("arr1[" + i + "] " +  j); */

            for (int i = 0; i < arr1.length; i++) {

                arr1[i] = i + 1;

            }

        System.out.println("arr1= " + Arrays.toString(arr1));

        System.out.println("-----------------------------------");
        int[] arr2 = new int[100];

        /* first approach
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = i +1;
        }*/
        //second approach
        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;

        }
        System.out.println("arr2= " + Arrays.toString(arr2));






    }
    }
