/*Create a emoji program:
        1- Check if emoji has 2 characters. If it is not, print “invalid emoji”
        2-Valid emojis:
Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful,Otherwise invalid
Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid */

package Preparing.Day19_String_Class;

import java.util.Scanner;

public class Emoji_Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the emoji :");
        String emoji = input.nextLine();

        /* if (emoji.length() == 2) {
            System.out.println("Invalid Emoji");
            //return; // stop execution */


            char first = emoji.charAt(0);
            char second = emoji.charAt(1);
        if (emoji.length() == 2) {
            if (first == ':') {
                if (second == ')') {
                    System.out.println("Smile");

                } else if (second == '(') {
                    System.out.println("Sad");

                } else if (second == '/') {
                    System.out.println("Upset");
                } else {
                    System.out.println("unknown emoji");
                }


            } else if (first == ';') {
                if (second == ')') {
                    System.out.println("Wink");
                } else if (second == '0') {
                    System.out.println("Surprised");

                } else {
                    System.out.println("Unknown emoji");
                }

            }
        } else {
            System.out.println("invalid character");
        }


    }
}