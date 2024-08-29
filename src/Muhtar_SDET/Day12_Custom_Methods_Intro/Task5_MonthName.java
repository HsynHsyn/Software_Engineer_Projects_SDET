package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class Task5_MonthName {
    public static void main(String[] args) {

        displayMonthName(6);

    }
    public static void displayMonthName(int month) {

        String monthName = month==1 ? "January" :month==2 ? "February": month==3 ? "March" :month==4 ? "April"
                : month==5 ? "May" :month==6 ? "June": month==7 ? "July" :month==8 ? "August"
                : month==9 ? "September" :month==10 ? "October": month==11 ? "November" : "December";

        System.out.println(monthName);

        }

}

/*
Create a method named monthName that can display the name of the month based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */