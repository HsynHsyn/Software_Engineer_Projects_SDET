package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat10_MaxSpan {
    public static void main(String[] args) {

        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
    }

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;



        //ArrayList<Integer> maxSpanList = new ArrayList<>();
        //int max = nums[1]-nums[0];

        if (nums.length == 1 || nums.length == 2 ) {
            maxSpan = 1;
        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if ((nums[i] == nums[j]) && j > i){

                    int span = j - i + 1;

                   if (maxSpan < span){
                       maxSpan = span;
                   }
             }
            }
       }

        return maxSpan;
    }
}
/*
Consider the leftmost and rightmost appearances of some value in an array.
 We'll say that the "span" is the number of elements between the two inclusive.
 A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */