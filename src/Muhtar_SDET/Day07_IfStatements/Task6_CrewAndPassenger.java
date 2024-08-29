package Muhtar_SDET.Day07_IfStatements;

public class Task6_CrewAndPassenger {
    public static void main(String[] args) {

        int totalPeople = 100;
        ///
        String result = "";
        if (totalPeople == 50 || totalPeople == 75 || totalPeople == 100) {
            if (totalPeople == 50) {
                result += "20 crew, 30 passengers";
            } else if (totalPeople == 75) {
                result += "25 crew, 50 passengers";
            } else {
                result += "30 crew, 70 passengers";
            }
        } else {
            result += "The number is not valid";

        }
        System.out.println(result);
    }
}
/*
1. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */