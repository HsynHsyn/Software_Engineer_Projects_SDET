package Muhtar_SDET.Day11_String_Continue;

import java.util.Scanner;

public class Task8_CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // asking from user in order to get words

        System.out.println("Enter the first word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter teh second word: ");
        String secondWord = input.nextLine();

        String combineWord = firstWord.concat(secondWord); // concat() method uses

        String lastIndex = firstWord.substring(firstWord.length() - 1); // to be able to find of firstWord's last character
        String firstIndex = secondWord.substring(0, 1); // to be able to find of secondWord's first character
        System.out.println(lastIndex);
        System.out.println(firstIndex);

        if (lastIndex.equals(firstIndex)) { // we have to use equals for checking equality
            combineWord = firstWord.concat(secondWord.substring(1)); // discarding of first character of secondWord
            System.out.println(combineWord);
        }else{
            System.out.println(combineWord);
        }

    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */
