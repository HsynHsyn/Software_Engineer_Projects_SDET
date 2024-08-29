package Muhtar_SDET.Day38_Exception_Handlings;

import Muhtar_SDET.Day09_Switch_Continue_Scanner.ScannerIntro;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age< 0 || age > 150) {
            /*System.err.println("Invalid age");
            System.exit(1);*/
            if (age < 0) {
                throw new InputMismatchException("age of the person should not be negative"); // we create this
            } else {
                throw new InputMismatchException("age of the person should not be greater than 150");

            }
        }
        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

        System.out.println("---------------------------------------------------");

        // throw new RuntimeException("Runtime exception");
        // System.out.println("Hello World");  // it can not be used after throw exception, gives compile error

        // throw new FileNotFoundException(" ");

        RuntimeException exception = new RuntimeException();

        throw exception;

    }
}
