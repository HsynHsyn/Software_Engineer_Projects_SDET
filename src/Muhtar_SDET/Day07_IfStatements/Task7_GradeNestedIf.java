package Muhtar_SDET.Day07_IfStatements;

public class Task7_GradeNestedIf {
    public static void main(String[] args) {

        char gradeLevel = 'S';

        String result ="";

        if (gradeLevel == 'A' || gradeLevel == 'B' || gradeLevel == 'C'||gradeLevel == 'D'||gradeLevel == 'F') {
            if(gradeLevel == 'A'){
                result = "Excellent";
            } else if (gradeLevel == 'B') {
                result = "Great Job";
            }else if (gradeLevel == 'C') {
                result = "Good";
            }else if (gradeLevel == 'D') {
                result = "Passed";
            }else{
                result = "Failed";

            }
        }else {
            result +="invalid";
        }
        System.out.println("result is " +result);

    }
}

/*2. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
other wise: invalid

NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT */