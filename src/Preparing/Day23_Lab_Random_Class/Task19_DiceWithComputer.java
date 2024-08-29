package Preparing.Day23_Lab_Random_Class;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Task19_DiceWithComputer {
    public static void main(String[] args) {

        Random rn = new Random();

        int countUserWin = 0;
        int countComWin = 0;
        int equal = 0;
        for (int i = 0; i < 10; i++) {
            int randomUserDice = rn.nextInt(6) + 1;
            int randomComDice = rn.nextInt(6) + 1;

            if (randomComDice > randomUserDice) {
                countComWin += 1;
            } else if (randomUserDice > randomComDice) {
                countUserWin += 1;
            }else {
                equal += 1;
            }

        }
        System.out.println("User won " + countUserWin + " times, Computer won " + countComWin + " times and " + equal + " times equal" );

        if (countUserWin > countComWin){
            System.out.println("User is Grand winner");
        }else {
            System.out.println("Computer is Grand winner");

        }
    }
}