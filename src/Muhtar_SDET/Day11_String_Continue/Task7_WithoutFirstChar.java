package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task7_WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter teh second word: ");
        String secondWord = input.nextLine();

        System.out.println(firstWord.substring(1));  // substring method
        System.out.println(secondWord.substring(1)); // substring method


    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */