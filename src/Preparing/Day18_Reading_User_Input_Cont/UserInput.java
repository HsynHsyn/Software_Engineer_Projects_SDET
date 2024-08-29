package Preparing.Day18_Reading_User_Input_Cont;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b1=sc.nextByte();
        System.out.println("Byte value is : "+ b1);

        System.out.println("Enter a short value: ");
        short s1=sc.nextShort();
        System.out.println("Short value is : "+ s1);

        System.out.println("Enter a short value: ");
        int i1 = sc.nextInt();
        System.out.println("Int value is : "+ i1);



    }
}