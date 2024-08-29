package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class Task6_NameOfDay {
    public static void main(String[] args) {
        day(8);
        day(5);day(6);
    }

    public static void day(int day){

        String dayName = day==1 ? "Sunday" :day==2 ? "Monday": day==3 ? "Tuesday" :day==4 ? "Wednesday"
                : day==5 ? "Thursday" :day==6 ? "Friday": day==7 ? "Saturday" : "Invalid Number";

        System.out.println(dayName);
    }
}
/*
Create a method named day that can display the name of the day based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */