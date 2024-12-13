package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat7_lucky13 {

    public static void main(String[] args) {

        System.out.println( lucky13(new int[]{2, 7, 2, 1}));
    }

    public static boolean lucky13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 || nums[i] == 3){
                return false;

            }

        }

        return true;

    }

}


/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */