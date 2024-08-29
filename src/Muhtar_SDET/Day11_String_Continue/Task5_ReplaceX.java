package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task5_ReplaceX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        if (word.startsWith("x") || word.startsWith("X")) { // if the word starts with x or X
            String newWord= word.toLowerCase().replace("x","a"); // assigned new string with lowercase after that replaced it
            System.out.println(newWord);
        }else {
            System.out.println(word + " does not start with x");
        }

    }
}
/*
 Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */