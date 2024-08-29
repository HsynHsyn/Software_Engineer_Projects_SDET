package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task9_CalledEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // asking from user in order to get words

        System.out.println("Enter the first word: ");
        String email = input.nextLine();
        input.close();

        String name = "";
        String surname = "";

        if (email.contains("_")){ // if email has "_"
            name = email.substring(0,email.indexOf("_")); // separating name from email
            surname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));// separating surname from email

            // This concatenates the user's surname, an underscore, their name, and the domain part of their email address (from '@' onward) to create a new email address.
            String lastEmail=surname.concat("_").concat(name).concat(email.substring(email.indexOf("@"))); // name and surname make concat then finds rest from '@' part
            System.out.println(lastEmail);

        }else{
            System.out.println(email);
        }

    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */