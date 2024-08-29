package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task13_StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total shares you have already done : "); // asking user
        int totalShare = input.nextInt();

        double totalValue = 0; // universal  value for printing
        String companyName ="";//universal  value for printing
        if (totalShare >= 0){ // if totalShare equal and less than 0 it will not execute
            System.out.println("How much their total value in the stock market is : ");
            totalValue = input.nextDouble(); // asking user

            input.nextLine(); // this is for not running before asking line 22. 18 line has a one enter command

            System.out.println("Enter the name of the company you own the most shares in : ");
            companyName = input.nextLine();  // asking user

        }else {
            System.out.println("Please enter correct value");
        }
        // print all information about the question
        System.out.println("Your total stock market holding is " + ", " + totalShare + " which is made up of $" + totalValue + ", shares. "+ companyName + " is your company holdings");


    }
}
/*
Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */