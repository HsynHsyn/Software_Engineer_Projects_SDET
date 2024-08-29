package Muhtar_SDET.Day07_IfStatements;

public class Task8_AgeGroups {
    public static void main(String[] args) {

        int age = 180;
        String ageRange = "";
        if (age > 0 && age>150 == false) {
            if (age < 21) {
                ageRange += "You are Teenager";
            }else if (age >= 21 && age < 55) {
                ageRange += "You are an Adult";
            }else {
                ageRange += "You are Senior";
            }
        }else {
            System.out.println("This is an invalid number");
        }
        System.out.println(ageRange);
    }
}

/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */