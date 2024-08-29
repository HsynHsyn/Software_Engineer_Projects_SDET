package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;

public class Task7_GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        int score = input.nextInt();


        String grade = (score >0 && score<100) ?
                (score >= 90) ? "A" :  (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 59) ? "D" : "F"
                :"Invalid";
        System.out.println("grade = " + grade);
    }
}
/*
Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */