package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

import java.util.Scanner;

public class Task1_CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Asking info from user

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();



        // If - Else block
        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the credentials are correct
            System.out.println("Logged in");

        } else { // otherwise

            for (int i = 0; i < 2; i++) {

                if (i != 1) {// if user try 3 times it will give an error messages
                    System.err.println("incorrect username or password, please re-enter");
                }else { // for warning
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }

                // Asking username and password from user again
                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the user enters valid credentials, this is also last chance
                    System.out.println("Logged in");
                    break;
                }

            }
            // it is used equals() method because u and p are object
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) { // after all tree attempts , if the information are not correct
                System.err.println("Your account now is locked, please contact with the support team");
            }


        }
        input.close();
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