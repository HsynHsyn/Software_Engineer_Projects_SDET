package Muhtar_SDET.Day13_Custom_Methods_Continue;

import java.util.Scanner;

public class ReturnStatementPractice3 {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if (month < 1 || month > 12) {
            System.err.println("Invalid Number");
            return;
        }
        switch (month) { // 1 ¬ 12
            case 2 :
                System.out.println("28 Days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("31 days");
        }

    }


}
