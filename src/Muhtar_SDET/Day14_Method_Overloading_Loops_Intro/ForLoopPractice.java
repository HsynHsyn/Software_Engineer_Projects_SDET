package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class ForLoopPractice {
    public static void main(String[] args) {
        // for(;;) --> infinite for loop
        for (int i = 5; i < 10 ; i++) {
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------------");
        for (int i = 10; i >= 5 ; i--) {
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------------");

        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i + " ");

        }
        System.out.println("-----------------------------------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("-----------------------------------");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }
    }
}
