package Muhtar_SDET.Day07_IfStatements;

public class Task5_NestedIfMonthName {

    public static void main(String[] args) {

        int n = 12;

        String month = "";

        if (n >= 1 && n <= 12) {

            if (n == 1) {
                System.out.println("January");
            } else if (n == 2) {
                System.out.println("Feb");
            } else if (n == 3) {
                System.out.println("March");
            } else if (n == 4) {
                System.out.println("April");
            } else if (n == 5) {
                System.out.println("May");
            } else if (n == 6) {
                System.out.println("Jun");
            } else if (n == 7) {
                System.out.println("July");
            } else if (n == 8) {
                System.out.println("August");
            } else if (n == 9) {
                System.out.println("Sep");
            } else if (n == 10) {
                System.out.println("Oct");
            } else if (n == 11) {
                System.out.println("Now");
            } else {
                System.out.println("Dec");
            }

        } else {
            month = "No such a month";

        }
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)
Ex:
Given:
number = 10
output:
October
 */