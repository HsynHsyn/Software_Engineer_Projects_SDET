package Preparing.Day26_Arrays_Cont;

public class Array2Dimention {
    public static void main(String[] args) {
        int[][] scores = new int[3][4];
        System.out.println(scores); // [[I@5f184fc6
        //first row
        System.out.println(scores[0][0]); // 0
        System.out.println(scores[0][1]); // 0
        System.out.println(scores[0][2]); // 0
        System.out.println(scores[0][3]); // 0

        //second row
        System.out.println(scores[1][0]); // 0
        System.out.println(scores[1][1]); // 0
        System.out.println(scores[1][2]); // 0
        System.out.println(scores[1][3]); // 0

        //third row
        System.out.println(scores[2][0]); // 0
        System.out.println(scores[2][1]); // 0
        System.out.println(scores[2][2]); // 0
        System.out.println(scores[2][3]); // 0

        System.out.println("--------------------------------");

        scores[0][0] = 85;
        scores[0][1] = 50;
        scores[0][2] = 30;
        scores[0][3] = 22;

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[0][3]);



    }






}
