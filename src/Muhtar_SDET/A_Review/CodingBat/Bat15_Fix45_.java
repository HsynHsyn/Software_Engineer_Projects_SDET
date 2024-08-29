package Muhtar_SDET.A_Review.CodingBat;

import java.util.Arrays;

public class Bat15_Fix45_ {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix45(new int[] {5, 4, 1, 5, 4, 1})));
    }

    public static int[] fix45(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4) ){ // j == 0 ifadesi true oldugu icin sag taraf calismasina gerek kalmaz true olur
                        nums[j] = nums[i + 1];
                        nums[ i + 1 ] = 5;
                    }


                }
            }

        }


        return nums;
    }

}
