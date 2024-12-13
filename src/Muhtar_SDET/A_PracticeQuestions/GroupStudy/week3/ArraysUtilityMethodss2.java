package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week3;

import java.util.Arrays;

public class ArraysUtilityMethodss2 {
    public static void main(String[] args) {

        int[] score = {12,78,90,67,99};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score); // single dimensional array

        System.out.println(result);

        System.out.println("----------------------------------------------");
        // equals()
        //***** we can use sort() (smallest to larger) method before the equals() ******//
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        boolean r1 = Arrays.equals(a1,a2); // *** they must be same element same order
        System.out.println(r1);


        System.out.println("----------------------------------------------");
        // sort()

        int[] nums = {100,500,6,552,44,88,99,54,66,33,78};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); // return void

        System.out.println(Arrays.toString(nums)); // sorted nums

        System.out.println("Minimum number: " + nums[0]); // it is not allowed in the interview because they want logic
        System.out.println("Minimum number: " + nums[nums.length-1]);

        System.out.println("----------------------------------------------");
        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1,b2));
        System.out.println("----------------------------------------------");

        String[] students = {"Madivar", "Ali", "Abdullah", "Alena"}; // if first character same it passes second character so on

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------------");
        // copyOf()--- starts from first element
        int[] array = {10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array,7);
        int[] array3 = Arrays.copyOf(array,10); // [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]


        System.out.println(Arrays.toString(array3));

        int[] n1 = {10,20,30,40,};
        int[] n2 = {10,20,30,40,50,60,70};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i= 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i] ;

        }
        System.out.println(Arrays.toString(n3));

        System.out.println("----------------------------------------------");
        // copyOfRange() it can start whenever you want elements
        char[] ch = {'A','B','C','D','E','F','G'};
        char[] result1 = Arrays.copyOfRange(ch, 1,3); // excludes ending index

        System.out.println(" result1: " + Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch,2, 5); // excludes ending index
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch,2, ch.length);
        System.out.println(Arrays.toString(result3));

    }
}
