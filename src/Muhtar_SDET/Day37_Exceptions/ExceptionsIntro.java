package Muhtar_SDET.Day37_Exceptions;


import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str = "Java";

        //char ch = str.charAt(250); // unchecked exceptions because run time
        //System.out.println(ch);

        Pizza pizza = null; // null is not object
       //  pizza.calcCost(); // unchecked exceptions because run time

        System.out.println("Hello World");

        //System.out.println(50/0); // unchecked exceptions // ArithmeticException

        System.out.println("---------------------------------");
        // this has a bug but not exception
        int score =100;

        if (score >59){
            System.out.println("your grade is D");
        } else if (score > 70 ) {
            System.out.println("your grade is C");
        }

        System.out.println("---------------------------------");
        //FileInputStream file = new FileInputStream(""); // Checked exception, cannot run program
                                                                // unwanted

        //Thread.sleep(3000);  // Checked exception,


    }

}