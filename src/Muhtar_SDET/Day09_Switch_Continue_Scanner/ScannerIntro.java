package Muhtar_SDET.Day09_Switch_Continue_Scanner;

// wild import is import package.*;  // import java.util.*;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        //byte num1= input.nextByte();
        short num2 = input.nextShort();
        System.out.println("Please enter second number : ");
        short num3  = input.nextShort();

        System.out.println("Please enter third number : ");

        int num4 = input.nextInt();

        System.out.println("Please enter third number : ");

        long num5 = input.nextLong();
        long num6 = (int)input.nextLong();


        input.close(); // scanner is closed, can not read user inputs again

        System.out.println("Please enter third number : ");

        //long num7 = input.nextLong(); // scanner is closed and cannot read this line

        System.out.println("You entered  first number = " + num2);
        System.out.println("You entered   second number= " + num3);
        System.out.println("You entered   third number= " + num4);
        System.out.println("You entered   third number= " + num5);
        System.out.println("You entered   third number= " + num6);
        //System.out.println("You entered   third number= " + num7);


    }
}
