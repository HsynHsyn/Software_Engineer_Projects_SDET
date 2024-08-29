package Muhtar_SDET.A_Review.Review;

import java.util.Scanner;

public class review6_simpleCalculator {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

       String answer = "yes";
        while (answer.equals("yes")){

            System.out.println("Please enter the first number");
            double num1 = input.nextDouble();

            System.out.println("Please enter the operator");
            char operator = input.next().charAt(0);

            //double result = 0;
            while (! (operator == '+' || operator == '-' || operator == '*' || operator == '/')){

                System.out.println("Invalid operator, please try again");
                operator = input.next().charAt(0);
            }

            System.out.println("Please enter the second number");
            double num2 = input.nextDouble();

            double result = (operator == '+') ? num1 + num2
                    : (operator == '-') ? num1 - num2
                    :(operator == '*') ? num1 * num2
                    :num1 / num2;

            System.out.println("result = " + result);

            System.out.println("Would you like to continue ? Yes/No");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer! Would you like to continue ? Yes/No");
                answer = input.next().toLowerCase();
            }

        }input.close();

    }
}
/*
Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)

 */