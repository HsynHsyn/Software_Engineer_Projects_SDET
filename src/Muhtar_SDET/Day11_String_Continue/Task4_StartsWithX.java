package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task4_StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        String result = "";
        if (word.startsWith("x")) {
            result= word.replaceFirst("x","a");

        }else {
            System.out.println(word + " does not start with x");
        }

        System.out.println("result = " + result);

    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */