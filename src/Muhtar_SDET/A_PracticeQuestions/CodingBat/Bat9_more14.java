package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat9_more14 {

    public static void main(String[] args) {

        System.out.println(more14(new int[] {1, 4, 1}));
    }

    public static boolean more14(int[] nums) {

        int count1 = 0;
        int count4 = 0;

        for(int each : nums){

            if (each == 1){
                count1 ++;

            } else if (each == 4) {
                count4 ++;

            }
        }
        if (count1> count4){
            return true;
        }
        return false;
 }

}

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */