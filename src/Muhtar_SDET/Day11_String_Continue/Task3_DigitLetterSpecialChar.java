package Muhtar_SDET.Day11_String_Continue;

import java.awt.*;
import java.util.Scanner;

public class Task3_DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine(); // we can use Scanner objects one time in this way no need to use close() method
                                                        // you can type it

       //System.out.println("".charAt(0)); will give an error because there is not 0's index number

        if (str.length() >=1 ) { // if the string has at least one character
            char f = str.charAt(0); // the first character of string

            if (f >= 48 && f <= 57) { // we can use like if (f >= '0' && f <= '9')
                System.out.println("First character is digit");

            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");
                
            }else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");

            } else {
                System.out.println("first character is special character");

            }


        }else {
            System.out.println("String is empty");
        }

    }
}
/*
Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */