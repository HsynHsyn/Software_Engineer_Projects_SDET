package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class Task4_DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number");

        //int num =new Scanner(System.in).nextInt(); // if you want to use Scanner one time you can use like this

        int num = input.nextInt();

        String day = "Invalid";

        if (num>=1 && num<=7){
            day = (num==1) ? "Monday" : (num==2) ? "Tuesday": (num==3) ? "Wednesday": (num==4) ? "Thursday": (num==5) ? "Friday"
                    : (num==6) ? "Saturday" : "Sunday";

        }
        System.out.println(day);
        input.close();
    }
}
