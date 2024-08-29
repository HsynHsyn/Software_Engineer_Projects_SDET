// Write a program that ask user to enter 3 numbers and shows the total of numbers.

package Preparing.Day17_JavaMemory_Garbage_Collection_Reading_User_Input;

import java.util.Scanner;

class TotalNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userNumber1;
        int userNumber2;
        int userNumber3;

        System.out.println("Enter number 1 ");
        userNumber1 = myObj.nextInt();  // Read user input

        System.out.println("Enter number 2 ");
        userNumber2 = myObj.nextInt();  // Read user input

        System.out.println("Enter number 3 ");
        userNumber3 = myObj.nextInt();  // Read user input

        System.out.println("Total number is =" +(userNumber1 + userNumber2 + userNumber3));


    }

}


