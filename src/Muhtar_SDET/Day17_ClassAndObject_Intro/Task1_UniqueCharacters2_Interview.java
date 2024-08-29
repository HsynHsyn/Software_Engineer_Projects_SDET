package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class Task1_UniqueCharacters2_Interview {
    public static void main(String[] args) {

        // best approach
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0; // it will reset every time when the loop run

            for (int i = 0; i < str.length(); i++) { //checks how many times the ch has appeared in str
                if (str.charAt(i) == ch) { // if the ch has appeared in the string
                    frequency++;

                }
            }
            if (frequency == 1) { // if the frequency is one, then it s unique// we can use 2 times 3 times
                unique += ch;
            }

        }
    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */