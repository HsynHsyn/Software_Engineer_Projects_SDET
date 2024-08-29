package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task2_FrequencyOfAChar {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if (str.charAt(i) ==ch) { // if the character of the string is equal to the given character, it means the given character has appeared in the string
                                        // primitive char so we use str.charAt(i)
                count++;
            }

        }
        System.out.println("count = " + count);

    }
}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */