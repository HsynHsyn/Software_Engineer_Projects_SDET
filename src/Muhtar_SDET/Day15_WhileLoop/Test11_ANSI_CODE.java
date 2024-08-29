package Muhtar_SDET.Day15_WhileLoop;

import java.util.Scanner;

public class Test11_ANSI_CODE {
    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");

                // Read the user's input as an integer
                int number = input.nextInt();

                // Initialize a boolean  to true, assuming the number is prime
                boolean isPrime = true;

                // Loop from 2 to number/2 to check for factors

                if (number < 2){//Check if  number is less than 2 or even negative Number

                    isPrime =false; // Numbers less than 2 are not prime
                }
                for (int i = 2; i < number / 2; i++) {


                    // Check if number is divisible by i

                    if (number % i == 0 ) {// If number is divisible by any i, it is not prime

                        isPrime = false;
                        break; // Exit the loop
                    }
                }


                if (isPrime) {
                    System.out.println(RED+number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }

                input.close();// Close the scanner
            }
        }

