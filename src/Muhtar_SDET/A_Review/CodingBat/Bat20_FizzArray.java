package Muhtar_SDET.A_Review.CodingBat;

import java.util.Arrays;

public class Bat20_FizzArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(5)));
    }

    public static int[] fizzArray(int n) {

        int[] array = new int[n];

        if (n == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {

            array[i] = i;
        }
        return array;
    }





}
