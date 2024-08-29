package Muhtar_SDET.A_Review.CodingBat;

import java.util.Arrays;

public class Bat16_CanBalance {
    public static void main(String[] args) {

        System.out.println((canBalance(new int[] {1, 1, 1, 2, 1})));
    }

    public static boolean canBalance(int[] nums) {


        int leftSide = 0;
        int rightSide = 0;


        for (int i = 0; i <  nums.length; i++) {

            rightSide += nums[i];

        }
        for(int i = 0; i < nums.length; i++) {
            leftSide += nums[i];
            rightSide -= nums[i];

            if(leftSide == rightSide)
                return true;
        }

        return false;
    }
}

/*
Given a non-empty array, return true if there is a place to split the array
 so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */