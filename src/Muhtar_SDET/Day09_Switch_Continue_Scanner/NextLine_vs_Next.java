package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Enter

        System.out.println("Enter your age : ");
        int age  = input.nextInt(); //45 +  \n

        input.nextLine(); // Enter jumped to this line

        System.out.println("Enter your full name : ");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);



    }
}
