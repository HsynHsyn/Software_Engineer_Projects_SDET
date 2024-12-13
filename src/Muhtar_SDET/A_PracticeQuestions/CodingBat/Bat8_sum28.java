package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat8_sum28 {

    public static void main(String[] args) {

        System.out.println(sum28(new int[] {2, 3, 2, 2, 4, 2, 2} ));
    }

    public static boolean sum28(int[] nums) {

        int sum = 0;
        int count = 0;
        for (int num : nums) {

            if (num == 2){
                sum += num;
                count ++;
            }
        }
        if (count == 4 && sum == 8){
            return true;
        }

        return false; // it has to write return false/true because the method has to return something
    }

}

/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */