package Muhtar_SDET.A_PracticeQuestions.Programiz;

public class Pr_IsArrayBalanced {
    public static void main(String[] args) {

        System.out.println(isArrayBalanced(new int[] {1, 2, 3, 3}, 4));

    }
    public static String isArrayBalanced(int[] arr, int size) {

        int leftSide = 0;
        int rightSide = 0;
        int balance = size/2;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <balance; j++) {
                leftSide += arr[j];

            }
            for (int k = balance + 1; k <arr.length; k++) {
                rightSide += arr[k];
            }

            if (leftSide == rightSide){
                return "Array is balanced";
            }

        }


        return "Array isn't balanced";
    }
}

/*
Write a function to check if an array is balanced.

Difficulty: Medium

Instructions:

If the array is balanced, return "Array is balanced". Otherwise, return "Array isn't balanced".

An array is balanced if the sum of elements on the left side of any element in the array is equal to the sum of elements on the right side.

For this input:

arr[] = {1, 2, 3, 3}
size = 4
The result should be:

"Array is balanced"
Reason: In the given array, for the third element 3, the sum of left side elements (1+2=3) equals the sum of right side elements (3).
 So, it's a balanced array.
 */