package Muhtar_SDET.Day07_IfStatements;

public class Task9_GradeLevelNestedIf {
    public static void main(String[] args) {

        byte number = 11;

        boolean isNumberValid = number >= 1 && number <= 18 == true;

        String grade = "";

        if (isNumberValid){
            if (number >= 1 && number <= 5){
                grade += "Elementary school ";
            } else if (number <= 8) {
                grade += "Middle school";
            } else if (number <= 12){
                grade += "High school";
            } else if (number<=16) {
                grade += "College";
            }else if (number<=18) {
                grade += "Grad School";
            }
        }else {
            System.out.println("Invalid grade level");
        }
        System.out.println(grade);
    }
}

/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */