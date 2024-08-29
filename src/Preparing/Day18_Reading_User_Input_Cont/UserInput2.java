package Preparing.Day18_Reading_User_Input_Cont;

import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Provide a sentence and I will repeat it : ");

       String str= sc.next(); // Just one string prints (hello world--> hello)

        System.out.println(str);

        System.out.println("Provide a sentence and I will repeat it : ");

       //String str2= sc.nextLine(); // whole string prints (hello world--> hello world)

        //System.out.println(str2);

    }

}
