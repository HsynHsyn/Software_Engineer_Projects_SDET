package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class Task8_Vote {
    public static void main(String[] args) {

        eligibleToVote(23, false);

    }
    public static void eligibleToVote(int age, boolean isAmerican){

        if (age >= 18 && isAmerican == true) {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */