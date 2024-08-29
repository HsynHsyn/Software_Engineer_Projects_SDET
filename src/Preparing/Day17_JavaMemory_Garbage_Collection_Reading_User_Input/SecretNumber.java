/* Write a guessing game where the user has to guess a secret number
between 1-20. After every guess, the program tells the user whether
their number was too large or too small. The program will keep asking
the user to enter the number until he finds the correct number.
When the correct answer is found, the program will display "Congrats,you got it"*/

package Preparing.Day17_JavaMemory_Garbage_Collection_Reading_User_Input;
import java.util.Scanner;
import java.util.Random;


public class SecretNumber {
    public static void main(String[] args) {
       // Random random = new Random();
       // int secretNumber= random.nextInt();
        int guess = 0;
        int secretNumber= 9;
        Scanner myObj = new Scanner(System.in);

        while ( secretNumber != guess ){
            System.out.println("Enter the your guess: ");
            guess = myObj.nextInt(); // to read a line

            // secretNumber= myObj.nextInt();
            if (guess < 1 || guess > 20) {
                System.out.println("Please enter a number between 1 and 20.");

            }else if (guess < secretNumber) {
                System.out.println("Secret number is too large");

            } else if (guess > secretNumber) {
                System.out.println("Secret number is too small");

            } else {
                System.out.println("invalid number: ");

            }
        }

        System.out.println("Congrats, you got it!");

    }

}
