package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Task6_OddOrEven {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

                        //String answer= "yes"; we can use inside of the while parenthesis
    while (true) {      //while (answer.equals("yes"))

        System.out.println("Enter a number");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        System.out.println("Would you like to enter another number ? Yes/No");
        String answer = input.next().toLowerCase();

        while (!((answer.equals("yes")) || answer.equals("no"))) {
            System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();

        }
        if (answer.equals("no")) { //String answer= "yes"; if we use this statement no need to use  if (answer.equals("no")) part
            break;
        }

    }
    }

}
