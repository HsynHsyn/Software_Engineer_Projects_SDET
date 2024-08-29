package Preparing.Day24_Arrays;

import java.util.Scanner;

public class Task2_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String [] days;
//        days = new String[7];
        String [] days = new String[7];

        days[0] = "Mon";
        days[1] = "Tues";
        days[2] = "Wed";
        days[3] = "Thurs";
        days[4] = "Fri";
        days[5] = "Sat";
        days[6] = "Sun";

        System.out.println("Enter the index of day: ");
        int index = sc.nextInt();

        System.out.println("Today is " + days[index]);
    }
}
/*

Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
 */