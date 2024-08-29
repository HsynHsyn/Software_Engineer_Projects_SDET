package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("ch = " + ch);

        System.out.println("Would you like to continue ?");

        //String answer = input.next(); // only print first string before first gap
        String answer1 = input.nextLine(); // it prints everything in the sentence

       //System.out.println("You have entered : " +  answer);
        System.out.println("You have entered : " +  answer1);
        input.close();
    }
}
