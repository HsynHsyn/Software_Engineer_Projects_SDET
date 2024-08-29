/*
Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6
 */

package Preparing.Rewieving;

import java.util.Scanner;

public class NewTask4_Counts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your comment : ");
        String comment= input.nextLine();

        System.out.println(counts(comment));
    }
    public static String counts(String comment) {
        int letter =0;
        int space=0;
        int num=0;
        int other=0;

        // Iterate through the character comment to categorize characters
        for (int i=0; i<comment.length(); i++){
            // Check if the character is a letter
            if(Character.isLetter(comment.charAt(i))){
                letter+=1;
            // Check if the character is a space
            }else if(Character.isSpaceChar(comment.charAt(i))){
                space+=1;
            // Check if the character is a digit (number)
            }else if(Character.isDigit(comment.charAt(i))){
                num+=1;
            // Character falls into the "other" category if none of the above conditions are met
            }else{
                other+=1;
            }
        }

        return "letter: "+letter+" space: "+space+ " num: "+ num+ " other: "+ other;
    }
}
