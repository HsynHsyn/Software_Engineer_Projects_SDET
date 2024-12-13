package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week3;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        // minimum size of the array is 0.
        // import java.util.Arrays

        int[] scores = new int[5] ; // index: 0¬4

       /* System.out.println(scores); // [I@5f184fc6 / hash-code
        System.out.println(scores[0]); // default 0
        System.out.println(scores[1]); // default 0 */

        scores[2]= 78;
        scores[0]= 34;
        scores[3]= 44;
        scores[4]= 77;
        scores[1]= 98;

        //scores[5]= 78; // now we cannot see an error but when you start the program compiler will give an error
        //scores[-1]= 78; // now we cannot see an error but when you start the program compiler will give an error

        // and above information will not move to new scores
        // scores = new int[10] ; // when we create new scores object, int[] scores = new int[5] ; will be available for garbage

        // above 2 objects are eligible for garbage collection
        //scores = new int[50] ; // index : 0-49
        System.out.println(Arrays.toString(scores)); // to print them all
        System.out.println(scores[2]);

        for (int i = 0; i < scores.length; i++) { // length variable
            System.out.println(scores[i]);

        }
        System.out.println(scores[scores.length-1]);

        System.out.println("---------------------------------------------------------------------");

        // arrays literals
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
        System.out.println("----------------------------------------------------------------------------");

        // arrays objects
        String[] a1 =  {"Umran", "Mehmet"}; // (garbage) in java one reference variable represents one object
                                            // but objects can represents more than one reference number

        a1 = new String[]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1));
        System.out.println("--------------------------------------------------------------------------");



    }
}
