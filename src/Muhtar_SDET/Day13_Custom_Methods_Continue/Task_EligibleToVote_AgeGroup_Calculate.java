package Muhtar_SDET.Day13_Custom_Methods_Continue;

import java.util.Scanner;

 public class Task_EligibleToVote_AgeGroup_Calculate {
    public static void main(String[] args) {

        calculate(10,20,'/');
        ageGroup(20);
        eligibleToVote(23, true);

//       Scanner input = new Scanner(System.in);
//        System.out.println("Enter your two number and a math operator: ");
//        double n1 = input.nextDouble(),
//                n2 = input.nextDouble();
//        char operator = input.next().charAt(0);
//        calculate(n1,n2,operator);
    }
    public static void eligibleToVote(int age, boolean isAmerican ) {

        if (age >= 18 && isAmerican ){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void ageGroup(int age) {
        if (age < 21){
            System.out.println("You are a teenager");
        } else if (age >= 21 && age < 55) {
            System.out.println("You are an adult");
        }else if (age >= 55) {
            System.out.println("You are a senior");
        }else {
            System.out.println("Invalid value" + age);
        }
    }

    public static void calculate(double num1, double num2, char mathOperator){

       // double result = 0;

        switch (mathOperator){
            case '+' :
                System.out.println(num1 + " " + mathOperator + num2 + " = " + (num1 + num2) );

            case '-' :
                System.out.println(num1 + " " + mathOperator + num2 + " = " + (num1 - num2) );
                break;
            case '/' :
                System.out.println(num1 + " " + mathOperator + num2 + " = " + (num1 / num2) );
                break;
            case '*' :
                System.out.println(num1 + " " + mathOperator + num2 + " = " + (num1 * num2) );
                break;

            default:
                System.out.println("Invalid Operator" + mathOperator);
        }

     }

}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote
 */
