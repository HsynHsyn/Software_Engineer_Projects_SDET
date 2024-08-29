package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class Task11_MilesToKM {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Please enter mile value : ");

        double miles = input.nextDouble();

        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers");
    }
}

/*
Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */