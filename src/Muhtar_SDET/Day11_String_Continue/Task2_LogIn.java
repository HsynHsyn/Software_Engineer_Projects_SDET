package Muhtar_SDET.Day11_String_Continue;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Task2_LogIn {
    public static void main(String[] args) {

        String userName1 = "Cydeo";
        String password1 = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = input.nextLine();

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        input.close();

        if (userName.equals(userName1) && password.equals(password1)) {
            System.out.println("You are now logged in");
        } else {
            System.out.println("Incorrect username or password. Please try again");

        }

    }
}

/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password.
				 Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */