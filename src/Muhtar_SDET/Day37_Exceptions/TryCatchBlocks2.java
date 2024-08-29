package Muhtar_SDET.Day37_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Program1 started");
        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
                                        // printStackTrace() can be placed only in catch block
        } catch (RuntimeException e){ // strongly recommended printStackTrace() in the catch block
            //e.printStackTrace(); //    *** displays full details of the exception after the execution of program
            System.out.println(e.getMessage());
        }

        System.out.println("Program1 ended");

        System.out.println("=========================================================");

        System.out.println("Program2 started");

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace(); // we can use both of them ( getMessage() ) at the same time but not necessary
            System.out.println(e.getMessage());
        }
        System.out.println("Program2 ended");

        System.out.println("=========================================================");

        System.out.println("Program3 started");

        try {
            FileInputStream file = new FileInputStream("File Path");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Program3 ended");

        System.out.println("=========================================================");

        System.out.println("Program4 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program4 ended");


    }
}
