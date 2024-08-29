package Muhtar_SDET.A_Review.Programiz;

public class Pr_Parity {
    public static void main(String[] args) {

        System.out.println(checkSameParity(new int[]{2, 4, 7}, 3 ));
    }

    public static String checkSameParity(int[] arr, int size) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i-1] != 2){

                return "Not all numbers have the same parity";
            }

        }

       return "All numbers have the same parity";
    }


}
/*
Instructions

If all numbers have the same parity, return "All numbers have the same parity".
Otherwise, return "Not all numbers have the same parity".

Example

For this input

arr[] = {2, 4, 6}
size = 3

the result should be:

"All numbers have the same parity"

Reason: All numbers in the array (2, 4, 6} are even. Hence they share
the same parity.
 */