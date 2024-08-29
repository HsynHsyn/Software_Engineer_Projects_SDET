package Muhtar_SDET.Day09_Switch_Continue_Scanner;

public class Task2_NumberOfDays {
    public static void main(String[] args) {
        int month = 2;

        String result = "";

        switch (month){
            case 2 :
                result = "28 Days";
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                result = "31 Days";
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :
                result = "30 Days";
                        break;
            default:
                result = "Invalid";

        }
        System.out.println("result = " + result);
    }

}

/*
Create a class named NumberOfDays. An integer variable named month is given
        Use switch statement to write a program that can find the number of days in the given number of month.

                EX:
                    month = 5
                output:
                    31 days
                (Assume that February has 28 days)
            Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
 */