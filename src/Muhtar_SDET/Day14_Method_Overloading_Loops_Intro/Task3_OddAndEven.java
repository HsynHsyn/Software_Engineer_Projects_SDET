package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class Task3_OddAndEven {
    public static void main(String[] args) {

        System.out.println(isOdd(100)); // calling the method
        System.out.println(isEven(77));// calling the method


    }

       public static boolean isOdd(int num) {

        if (num % 2 != 0) { //if num does not divide to 2
            return true;
        } else {
            return false; // have to return
        }
    }
    public static boolean isEven(int num) {

        if (num % 2 == 0) { // if num divides to 2
            return true;
        } else {
            return false; // have to return
        }
    }
}
/*
Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */