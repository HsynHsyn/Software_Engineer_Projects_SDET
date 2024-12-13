package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat19_CountClumps {

    public static void main(String[] args) {

        System.out.println(countClumps(new int[] {1, 1, 1, 1, 1}));
    }

    public static int countClumps(int[] nums) {

        int clumps = 0;
        boolean inClump = false;

        /*
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
         */

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!inClump) {
                    clumps++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return clumps;
    }

}
/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */