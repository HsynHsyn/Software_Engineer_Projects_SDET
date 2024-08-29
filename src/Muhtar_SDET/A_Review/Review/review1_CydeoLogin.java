package Muhtar_SDET.A_Review.Review;

import java.util.Scanner;

public class review1_CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String userName = input.next(); // username has just one word

        System.out.println("Please enter your username: ");
        String passWord = input.next(); // passWord has just one word

        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")) {
            System.out.println("You are Logged in");
        }

        for (int i = 0; i < 2; i++) {
            System.err.println("incorrect username or password, please re-enter");

            System.out.println("Please enter your username: ");
            userName = input.next(); // username has just one word

            System.out.println("Please enter your passWord: ");
            passWord = input.next(); // passWord has just one word

            if ((userName.equals("Cydeo") && passWord.equals("WoodenSpoon"))) {
                System.out.println("You are Logged in");
                break;
            }

        }
        if (!((userName.equals("Cydeo") && passWord.equals("WoodenSpoon")))) {
            System.out.println("Your account now is locked, please contact with the support team");

        }input.close();


    }
}
/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */