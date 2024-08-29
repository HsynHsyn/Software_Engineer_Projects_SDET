package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';

        String result ="";
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Passed";
                break;
            default:
                result = "Please Enter Valid Value";
                break;  // break is the optional if it at the end of the statements but
                       // if the default is middle of the blogs it has to be added break statement. it highly recommends to last of the blogs.

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