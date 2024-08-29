package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task10_EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // asking from user in order to get words

        System.out.println("Enter the your email: ");
        String email = input.nextLine();
        input.close();

        String firstName = email.substring(0, email.indexOf("_")).replace(email.substring(0,1),email.substring(0,1).toUpperCase());
        //to find chars between "_" and "@" and replace with to uppercase first letter of the surname
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@")).replace(email.substring(email.indexOf("_")+1,email.indexOf("_")+2),email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase());
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First name: " +firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}
/*
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */