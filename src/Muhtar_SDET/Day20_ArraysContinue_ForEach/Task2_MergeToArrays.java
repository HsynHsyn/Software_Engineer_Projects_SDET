package Muhtar_SDET.Day20_ArraysContinue_ForEach;

import java.util.Arrays;
import Utilities.ArraysUtility ; // Utilities package is different package than Muhtar_SDET, so we imported

public class Task2_MergeToArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that third array has enough capacity to contain elements

        int k = 0; // for third array`s index number
        for (int i = 0; i < arr1.length; i++, k++) { // i: for first array`s index number
            arr3[k] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++, k++) {// i: for second array`s index number
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println("------------------------------------------");
        int[] a1 = {12,34,56,7,88,866,67};
        int[] a2 = {17,84,76,47,788,896,87};
        int[] a3 = ArraysUtility.merge(a1,a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------------");
        double[] b1 = {12.4,34.4,56,7,88,866,67};
        double [] b2 = {17,84,76.6,47.7,788.9,896.0,87.3};

        double[] b3 = ArraysUtility.merge(b1,b2);

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------------");
        char[] ch1 = {'a', 'b', 'c','d','e','F'};
        char[] ch2 = {'X', 'Y', 'Z', 'H'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("------------------------------------------");

        String[] str1 = {"ali", "bilal", "celal","deniz","eray","Hulya"};
        String[] str2 = {"Xavi", "Yasin", "Zain", "Hakan"};
        String[] str3 = ArraysUtility.merge(str1,str2);
        System.out.println(Arrays.toString(str3));



    }

}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */