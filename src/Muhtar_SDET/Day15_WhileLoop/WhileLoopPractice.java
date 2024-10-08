package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        while ( ! (age >=0 || age <= 150)) { // while the age is invalid
            System.out.println("Invalid entry! Please re-enter your age: ");
            age = input.nextInt();
        }

        if (age >= 21) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        input.close();

    }
}
