package Muhtar_SDET.Day07_IfStatements;

public class Task10_alphabet {
    public static void main(String[] args) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int i;
        int j = 0;
        String letter = "";
        String reverseLetter = "";
        for (i = 0; i < letters.length(); i++) {
           if (i < letters.length()) {
                letter += letters.charAt(i);
                reverseLetter += letters.toLowerCase().charAt(letters.length() - j - 1);
                j += 1;
            }
        }
        System.out.print(letter +"\n");
        System.out.print(reverseLetter);

    }
}


/*
    Use a `loop` to print the alphabet from `A` to `Z`. Print all the characters in one line, with no spaces between them.

    Also use another `loop` to print the alphabet from `z` to `a`. Print all the character in one line, with no spaces between them.

    Note: There will be two lines in the output. One of the uppercase letters from `A` to `Z`, and a second line for the lowercase letter from `z` to `a`.

    Note: Do not just print the characters as a String, use a loop to iterate through all the characters

    Example Flow:

    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    zyxwvutsrqponmlkjihgfedcba */