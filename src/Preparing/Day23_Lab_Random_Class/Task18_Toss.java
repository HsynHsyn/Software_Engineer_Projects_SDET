package Preparing.Day23_Lab_Random_Class;

import java.util.Random;
import java.util.Scanner;

public class Task18_Toss {
    public static void main(String[] args) {

        Random rn = new Random();
        int toss = rn.nextInt(2);
        //int tails = rn.nextInt(2) + 1 ;

        for (int i = 1; i <= 10; i++) {
            if (rn.nextInt(2) == 0) { // heads = 0 and tails = 1
                System.out.println("Heads");

            }else {
                System.out.println("Tails");

            }

        }






    }
}
