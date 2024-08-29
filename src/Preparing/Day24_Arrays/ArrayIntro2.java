package Preparing.Day24_Arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        int[] scores = new int[5];
        scores[0] = 80;
        scores[1] = 85;
        scores[2] = 90;
        scores[3] = 50;
        scores[4] = 60;
        scores[1] = 10000;

        System.out.println(scores[0] = 80);
        //System.out.println(scores[1] = 85);
        System.out.println(scores[2] = 90);
        System.out.println(scores[3] = 50);
        System.out.println(scores[4] = 60);
        System.out.println(Arrays.toString(scores));

        System.out.println("--------------------------");
        int avgScore = (scores[0] + scores[1]+scores[2]+ scores[3] + scores[4])/5;
        System.out.println(avgScore);


    }
}
