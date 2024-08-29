package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task11_TipCalculator {
    public static void main(String[] args) {

        // Get the required information from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to split: ");
        String yesOrNo = input.nextLine();

        System.out.println("Enter the check amount: ");
        double checkAmount = input.nextInt();

        input.nextLine();

        System.out.println("How was the service quality: ");
        String serviceQuality = input.nextLine();

        int numberOfPeople = 1;
        if (yesOrNo.equalsIgnoreCase("Yes")){
            System.out.println("Enter the number of people: ");
            numberOfPeople = input.nextInt();
        }
        // Calculate the total tip
        double totalTip = serviceQuality.equals("Excellent") ? checkAmount*0.25: serviceQuality.equals("Great") ? checkAmount*0.20
                :serviceQuality.equals("Good") ? checkAmount*0.15 : serviceQuality.equals("Fair") ? checkAmount*0.10
                : serviceQuality.equals("Poor") ? checkAmount*0.05 : 0;

        // If the bill is split, calculate the amount per person
        double totalToPay = checkAmount + totalTip;
        double tipPerPerson = totalTip /numberOfPeople ;
        double totalPerPerson = totalToPay / numberOfPeople;

        // Print the results
        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + checkAmount + totalTip);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson );
        System.out.println("Tip per person: " + tipPerPerson);

    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */