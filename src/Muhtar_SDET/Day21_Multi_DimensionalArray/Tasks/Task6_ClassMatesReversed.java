package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task6_ClassMatesReversed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] classmates = new String[3];
        String reverseClassmates = "";

        for (int i = 0; i < classmates.length; i++) {
            System.out.println("Enter " + (i + 1) + ". student`s name: ");
            classmates[i] = input.nextLine();

            for (int j = 0; j < classmates[i].length(); j++) {

                reverseClassmates += classmates[i].charAt(classmates[i].length()-1-j) ;

            }
            reverseClassmates += "\n";
        }
        System.out.println(reverseClassmates);

        //second

        /*
        for(String eachName : classmates){
            String reversedName = "";
            for(int i = eachName.length() - 1; i >= 0; i--){
                reversedName += eachName.charAt(i);
            }
            System.out.println(reversedName);
        }

         */

    }

}











/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */