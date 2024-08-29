package Preparing.Day24_Arrays;

import java.util.Scanner;

public class Task1_MonthName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String[] months = new String[12];
        String[] months;
        months = new String[12];

        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        System.out.println("Enter your month index number: ");
        int index = sc.nextInt();

        System.out.println("The month name is " + months[index]);

    }
}
/*
Create an array that holds 12 months names
User should be able to enter month index and output should be:
“The month name is <MonthName>”
 */