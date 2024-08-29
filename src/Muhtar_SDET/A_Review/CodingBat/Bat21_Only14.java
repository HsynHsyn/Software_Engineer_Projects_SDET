package Muhtar_SDET.A_Review.CodingBat;

public class Bat21_Only14 {
    public static void main(String[] args) {


    }

    public boolean only14(int[] nums) {

        boolean hasOne = false;
        boolean hasFour = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 4) {
                hasFour = true;
            }

            // If both 1 and 4 are found, return false immediately
            if (hasOne && hasFour) {
                return false;
            }
        }

        // If the loop completes, it means the array doesn't contain both 1 and 4
        return true;
    }

}
/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
