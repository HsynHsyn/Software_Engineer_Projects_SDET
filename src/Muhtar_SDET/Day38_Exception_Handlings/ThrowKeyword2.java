package Muhtar_SDET.Day38_Exception_Handlings;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowKeyword2 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        method1(); // again error because handled temporarily

        method2();
    }



    public static void pauseFor5Seconds() throws InterruptedException { // not actually handled, temporarily handled
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello world");
        pauseFor5Seconds(); // compile error due to the exception
                            // when you call the second time you can see same error
        System.out.println("Hello cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException { // when you are not going to call
        System.out.println("First program");

        Thread.sleep(30000);

        System.out.println("First program added");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }



}
