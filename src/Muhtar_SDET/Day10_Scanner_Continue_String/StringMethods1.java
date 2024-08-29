package Muhtar_SDET.Day10_Scanner_Continue_String;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {



        String str = "Cydeo";
        // index      01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);

        System.out.println("*********************************");
        //length()
        String sentence = "Java Programming Language";
        int length = sentence.length();
        System.out.println(length);

        int lastIndex = length-1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("*********************************");

        String s1 = "Wooden Spoon";

        char f  = s1.charAt(0);

        int lastIndexNum = s1.length()-1;
        char l = s1.charAt(lastIndexNum);
        System.out.println("first: " + f + " lastIndexNum: " + lastIndexNum);

        System.out.println("*********************************");
        //equals()
        String name1 = "Hakan";
        String name2 = new String("Hakan");
        //(name2 == name1) // false
        System.out.println(name1.equals(name2)); //*** true it just checks text

        System.out.println("*********************************");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java"); //object

        System.out.println(r1 == r2);       // false
        System.out.println(r1.equals(r2)); //true , care about just text not object
        System.out.println(r1.equals(r3)); //true , care about just text not object

        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you: ");
        int age = input.nextInt();

        System.out.println("Are you US citizen ? yes/no");
        String answer = input.next(); // object
        String  answer2 = "yes";

        System.out.println(answer2 ==answer); //false

        if (age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");


        }
        input.close();






    }
}
