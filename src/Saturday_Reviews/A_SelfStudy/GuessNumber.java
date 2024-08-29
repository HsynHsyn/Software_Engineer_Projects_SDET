package Saturday_Reviews.A_SelfStudy;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Random random = new Random();

        int secretNumber = new Random().nextInt(100);
        int guessingNumber = 0;
        int tries = 0;

        do {
            System.out.println("Guess the number: ");
            guessingNumber =  input.nextInt();
            tries++;

            if (guessingNumber > secretNumber) {
                System.out.println("Too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Too Small");

            }else {
                System.out.println("Congratulations");
            }

            if (tries > 5 && guessingNumber != secretNumber){
                System.out.println("you lost");
                break;
            }

        }while (guessingNumber != secretNumber);
        System.out.println("Game over");



    }
}
