/*
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */

package Preparing.Rewieving;

import java.util.Scanner;

public class NewTask3_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str =sc.nextLine();

        System.out.println("Reverse string: " +reverseString(str));

    }
    public static String reverseString(String str) {
        String reversed = "";
        for (int i=0; i<str.length(); i++){
            reversed = reversed + str.charAt(str.length()-i-1);
        }
        return reversed;
    }
}
