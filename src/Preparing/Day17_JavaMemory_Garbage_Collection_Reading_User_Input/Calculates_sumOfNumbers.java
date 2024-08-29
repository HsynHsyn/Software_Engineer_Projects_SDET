package Preparing.Day17_JavaMemory_Garbage_Collection_Reading_User_Input;

import java.util.Scanner;

public class Calculates_sumOfNumbers {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int number=1;
        int sumOfNumber=0;

        
        while(number>=0){

           System.out.println("Enter the your number: ");
           number= sc.nextInt();
           if (number>=0){
               sumOfNumber = sumOfNumber + number;

           }else {

               System.out.println("The sum of the entered numbers is: " + sumOfNumber);


           }


        }



    }

}

