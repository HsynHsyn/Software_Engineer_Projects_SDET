package Java_Labs.TheWeek8;

public class Task2_MortgageCalculator1 {
    public static void main(String[] args) {
        double loanAmount = 500000;
        int loanTermInYears = 30;
        String loanType = "FHA";

        double annualInterestRate = 0;
        double monthlyInterestRate = 0;


        switch (loanType) {

            case "Fixed" :
                if (loanTermInYears == 30){
                    annualInterestRate = 7.5;

                } else if (loanTermInYears == 15) {
                    annualInterestRate = 6.9;
                }
                break;

            case "FHA" :
                if (loanTermInYears == 30){
                    annualInterestRate = 7.24;

                } else if (loanTermInYears == 15) {
                        annualInterestRate = 6.62;
                }
                break;

            case "VA" :
                if (loanTermInYears == 30){
                    annualInterestRate = 6.75;

                } else if (loanTermInYears == 15) {
                        annualInterestRate = 5.99;
                }
                break;
            default:
                System.out.println("Invalid loan type");
                break;
        }

        monthlyInterestRate = annualInterestRate / 100 / 12;
        double numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - numberOfPayments));

        System.out.println("Your monthly mortgage payment for a " + loanTermInYears + " Yr. " + loanType + " loan is: $" + monthlyPayment);
        //System.out.printf("Your monthly mortgage payment for a %d Yr. %s loan is: $%.2f%n", loanTermInYears, loanType, monthlyPayment);

        /*
        Using printf
        - %d: Decimal integer
        - %f: Floating-point number
        - %s: String
        - %c: Single character
        - %x: Integer in hexadecimal format (base 16)
            int number = 123;
            System.out.printf("Integer: %d\n", number);
            System.out.printf("Product: %s, Quantity: %d, Price: %.2f USD\n", product, quantity, price);
         */

    }
}
/*
Create a Java class named MortgageCalculator with the following requirements:

    2.1 Define the following variables:

	        loanAmount: Represents the loan amount.
	        loanTermInYears: Represents the loan term in years.
	        loanType: Represents the type of loan.

    2.2 Determine the annual interest rates for different loan types:

            Fixed:
                30 years: 7.5%
                15 years: 6.9%

            FHA:
                30 years: 7.24%
                15 years: 6.62%

            VA:
                30 years: 6.75%
                15 years: 5.99%

    2.3 Write a program to calculate the monthly mortgage payment using the following formula:

        monthlyInterestRate = annualInterestRate / 100 / 12
        numberOfPayments = loanTermInYears * 12
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))


    2.4 Display the output in the following format:

            Example 1:
                loanAmount = $500,000
                loanTermInYears = 30
                loanType = "Fixed"

            Output:
                Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


    Ensure that the program accurately calculates the monthly mortgage payment based on the
    specified loan amount, term, and type.
 */
