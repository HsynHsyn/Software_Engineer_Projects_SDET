package Muhtar_SDET.Day11_String_Continue;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Task1_LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String first = input.nextLine();

        System.out.println("Please enter the first string: ");
        String second = input.nextLine();

        if (first.length() > second.length()) {

            System.out.println("longest string is " + first);

        } else if (first.length() < second.length()) {
            System.out.println("longest string is " + second);

        }else {
            System.out.println("Strings are equal ");
        }
        input.close();
    }

}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest
			string, if both have the same number of characters then print "Equal"
 */