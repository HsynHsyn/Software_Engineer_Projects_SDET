package Muhtar_SDET.Day20_ArraysContinue_ForEach;

import java.util.Arrays;

public class Task1_MultiplyOddNumbers  {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        //int[] newNumbers = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) { // first solution

                numbers[i] = numbers[i] * 2 ;
            }

            // second solution
//            if (numbers[i] % 2 == 0){
//                continue;
//            }
//            newNumbers[i] = numbers[i] * 2 ;

        }
        System.out.println(Arrays.toString(numbers));
    }


}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]
 */