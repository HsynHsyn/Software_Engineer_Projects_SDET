package Muhtar_SDET.Day10_Scanner_Continue_String;

import java.lang.String; // this automatically import by compiler
import java.lang.System; // this automatically import by compiler
import java.util.Scanner;


public class StringIntro {
    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);

        String t1 = "Python";

        // *** important *** //
        String t2 = new String("Python");
        String t3 = new String("Python");
        System.out.println(t2 == t3); //false

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t3); //false







    }
}
