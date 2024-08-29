// Write a program that ask user to enter his/her firstname and lastname. Display in the
//console total number of characters.

package Preparing.Day19_String_Class;

import java.util.Scanner;

public class Task1_Total_Number_Of_Characters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the surname: ");
        String surname = sc.nextLine();

        int nameLength = name.length();
        int surnameLength = surname.length();
        int totalNumber = nameLength+surnameLength;

    System.out.println("Total number of characters: " + totalNumber);}

}
