package Muhtar_SDET.Day12_Custom_Methods_Intro;

import java.util.Locale;

public class Task7_MonthNumber {
    public static void main(String[] args) {

        month("march");
        month("April");
    }
    public static void month(String month) {
        month = month.toLowerCase();
        if (month.equals("march")|| month.equals("may")|| month.equals("july")|| month.equals("september") || month.equals("october")|| month.equals("july")){
            System.out.println(month + " has 31 days");
        } else if (month.equals("april")|| month.equals("july")|| month.equals("september") || month.equals("november")) {
            System.out.println(month + " has 30 days");
        } else {
            System.out.println(month + " has 28 days");
        }

        /* second solution
        public static void hasDays(String month){

        month=month.toLowerCase();
        switch (month) {
            case "january","march","may","july","august","october","december"-> System.out.println("Has 31 days");
            case "february"-> System.out.println("Has 28 days");
            case "april", "june", "september","november"-> System.out.println("Has 30 days");
            default -> System.out.println("Invalid month");
        }
         */
    }

}

/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */