package Muhtar_SDET.A_PracticeQuestions.Review;

public class review2_FrequencyOfAChar {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char ch = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                count++;
            }

        }
        System.out.println(count);

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