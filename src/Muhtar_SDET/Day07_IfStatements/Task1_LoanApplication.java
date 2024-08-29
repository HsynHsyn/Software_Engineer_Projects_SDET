package Muhtar_SDET.Day07_IfStatements;

public class Task1_LoanApplication {
    public static void main(String[] args) {

        int salary = 55000,
            creditScore = 680;

        // solution 1
        String result ="";
        if ( salary >= 45000 && creditScore >= 700 ) {
           result = "You are eligible for the loan";
        }else{
            result = "You are not eligible for the loan";
        }
        System.out.println(result);
        // solution 2
        if ( salary >= 45000 && creditScore >= 700 ) {
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are not eligible for the loan");
        }
    }
}


/*
   1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */