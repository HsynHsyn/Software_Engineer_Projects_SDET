package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class arraysLiterals {
    public static void main(String[] args) {



        int[] numbers = new int[5]; // instantiated array one way

        int[] nums = {1,2,3,4,5}; // instantiated array another way

        int[] nums1 = new int[] {1,2,3,4,5}; // another way to show array

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(numbers));

        System.out.println("----------------------------------------");
        String[] days;
        days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println("----------------------------------------");






    }
}
