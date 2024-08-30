package Muhtar_SDET.Day38_Exception_Handlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        // *** throws is used for checked exceptions, it is temporary handling, just ignoring the problem
        // if you will not use the method again throws keyword is best choose


        System.out.println("Program1 started");

       // System.out.println(100/0);

        Thread.sleep(5000);//  InterruptedException

        System.out.println("Program1 ended");

        System.out.println("Program1 started");

        // System.out.println(100/0);

        Thread.sleep(5000);//  InterruptedException

        System.out.println("Program1 ended");

        System.out.println("------------------------------------------");

        System.out.println("Program2 started");

        // System.out.println(100/0);

        Thread.sleep(5000);//  InterruptedException

        System.out.println("Program2 ended");

        System.out.println("------------------------------------------");

        System.out.println("Program3 started");

        FileInputStream file = new FileInputStream(""); // the reason of error is we did not give file path

        System.out.println("Program3 ended");

    }

}
