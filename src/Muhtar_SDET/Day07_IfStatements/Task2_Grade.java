package Muhtar_SDET.Day07_IfStatements;

public class Task2_Grade {
    public static void main(String[] args) {

        char grade = 'A';

        String result ="";
        if (grade=='A') {
            result = "Excellent";
        }if (grade=='B') {
            result = "Great job";
        }if (grade=='C') {
            result = "Good";
        }if (grade=='D') {
            result = "Passed";
        }if (grade=='E') {
            result = "Failed";
        }
        System.out.println("your result is: "+ result);

    }
}

/*
2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */