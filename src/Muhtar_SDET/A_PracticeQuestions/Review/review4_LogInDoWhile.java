package Muhtar_SDET.A_PracticeQuestions.Review;

import java.util.Scanner;

public class review4_LogInDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Asking info from user

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("you are logged in");
        }
        String answer = "yes";
        do {
            System.out.println("incorrect username or password, please re-enter");

            System.out.println("Enter your username:");
            u = input.next();

            System.out.println("Enter your password:");
            p = input.next();

            if ((u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.out.println("you are logged in");
            }

            System.out.println("incorrect username or password, would you like to enter ? Yes/No");

            answer = input.next().toLowerCase();


        }while (answer.equals("yes"));

    }
}
/*Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon

Ask the user to enter their credentials.
If credentials are matched, your program should print "Logged in."

If the credentials are not matched, the program should allow
the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."*/