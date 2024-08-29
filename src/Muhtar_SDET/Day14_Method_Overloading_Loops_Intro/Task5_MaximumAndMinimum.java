package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class Task5_MaximumAndMinimum {
    public static void main(String[] args) {
        System.out.println("Max number is " + max(10.5,30.2));
        System.out.println("Max number is " + max(10,30));
        System.out.println("Min number is " + min(100,200));
        System.out.println("Min number is " + min(100.5,200.8));

    } // overloading methods
    public static int max(int num1, int num2) {
       return (num1 >= num2) ? num1: num2; // ternary statement
    }
    public static double max(double num1, double num2) {
        return (num1 >= num2) ? num1: num2; // ternary statement

    } // overloading methods
    public static int min(int num1, int num2) {
        return (num1 <= num2) ? num1 : num2; // ternary statement
    }
    public static double min(double num1, double num2) {
        return (num1 <= num2) ? num1 : num2; // ternary statement
    }
}


/*
Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */