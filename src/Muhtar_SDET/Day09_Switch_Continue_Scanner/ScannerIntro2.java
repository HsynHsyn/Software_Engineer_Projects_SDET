package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Decimal number: " );
        float num1 = input.nextFloat();

        System.out.println("Enter your second Decimal number: " );
        double num2 = input.nextDouble();

        System.out.println("Enter true or false: " );
        boolean r = input.nextBoolean();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

        input.close();
    }
}
