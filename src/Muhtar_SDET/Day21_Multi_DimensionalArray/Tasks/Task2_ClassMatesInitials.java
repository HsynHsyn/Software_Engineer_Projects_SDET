package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Scanner;

public class Task2_ClassMatesInitials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // getting names from user

        String[] classmates = new String[10]; // creating arrays which has 10 elements

        String initialsOfNames = ""; // initialize string variable

        for (int i = 0; i < classmates.length; i++) { // asking user to get 10 names
            System.out.println("Please enter your " + (i + 1) + ". classmate`s name: ");
            classmates[i] = input.nextLine(); // assigning names to every single elements
            initialsOfNames += classmates[i].charAt(0) + " "; // adding every student`s initial letter to initialsOfNames
        }
        System.out.println("initialsOfNames; " + initialsOfNames); // printing result
    }
}

/*

Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.


 */