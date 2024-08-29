package Muhtar_SDET.A_Review.CodingBat;

public class Bat12_ScoresIncreasing {

    public static void main(String[] args) {
        System.out.println(scoresIncreasing(new int[]{1, 1, 4, 5}));
    }

    public static boolean scoresIncreasing(int[] scores) {


        boolean result =  false;

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] >= scores[i-1]){

                result = true;
            }else {
                return false;
            }

        }


        return result;

    }
}
/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
 */