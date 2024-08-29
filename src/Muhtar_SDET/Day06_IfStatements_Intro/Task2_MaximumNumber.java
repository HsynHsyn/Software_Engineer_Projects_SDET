package Muhtar_SDET.Day06_IfStatements_Intro;

public class Task2_MaximumNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 < num2) {
            System.out.println(num2 + " is max");
        }
        if (num1 > num2) {
            System.out.println(num1 + " is max");
        }
        if (num1 == num2) {
            System.out.println(num2 + " and " + num1 +" is equal");
        }
    }
}
/*
1. Create a class named MaximumNumber.java
2. Declare the following variables:
1. num1
2. num2
3. Write a program that can print the maximum number between the
two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
20 is the maximum number
 */