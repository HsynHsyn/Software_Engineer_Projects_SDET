package Muhtar_SDET.A_Review.GroupStudy.Practice;

import java.util.Arrays;

public class ArraysUtility1 {
    public static void main(String[] args) {

        int[] score = {12,78,90,67,99};

        System.out.println(score);
        System.out.println(Arrays.toString(score));
        System.out.println(score[0]);
        System.out.println("--------------------------------");

        // equals()
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);

        System.out.println("----------------------------------------------");
        // sort()

        int[] nums = {100,500,6,552,44,88,99,54,66,33,78};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number: " + nums[0]); // it is not allowed in the interview because they want logic
        System.out.println("Minimum number: " + nums[nums.length-1]);

        System.out.println("----------------------------------");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println();

        System.out.println(Arrays.equals(b1,b2));

        String[] students = {"Madivar", "Ali", "Abdullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------");

        // copyOf()--- starts from first element
        int[] array = {10,20,30,40,50,60,70};//length = 7
        int[] array2 =Arrays.copyOf(array, 8);

        System.out.println(Arrays.toString(array2));


        int[] n1 = {10,20,30,40};
        int[] n2 = {10,20,30,40,50,60,70};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

                            // 4            11
        for (int i= 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i] ;

        }
        System.out.println(Arrays.toString(n3));

        System.out.println("---------------------------------------------");

        // copyOfRange() it can start whenever you want elements
        char[] ch = {'A','B','C','D','E','F','G'};
        char[] result1 = Arrays.copyOfRange(ch, 1,3);

        System.out.println(" result1: " + Arrays.toString(result1));
















    }
}
