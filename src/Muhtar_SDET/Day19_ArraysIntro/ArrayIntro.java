package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int score1 =  85;
        int score2 =  77;
        int score3 =  98;
        int score4 =  45;
        int score5 =  67;

        System.out.println("---------------------------------------");
        //preferred way
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





    }

}
