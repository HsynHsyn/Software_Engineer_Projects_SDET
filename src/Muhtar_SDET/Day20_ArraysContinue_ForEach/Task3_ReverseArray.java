package Muhtar_SDET.Day20_ArraysContinue_ForEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Task3_ReverseArray {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};
        
        int[] reverse = new int[array.length];

        for (int i = array.length-1, j=0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------");

        int[] nums = {100,200,3300,4000,5000,966};

        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */
/*
second approach

reverse same array
        for (int i = 0; i <nums2.length ; i++) {
            rev[i] = nums2[nums2.length - 1 - i];
        }
 */