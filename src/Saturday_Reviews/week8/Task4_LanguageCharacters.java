package Saturday_Reviews.week8;

import java.util.Arrays;

public class Task4_LanguageCharacters {
    public static void main(String[] args) {

        char[] characters = new char[26];

        for (int i = 0, t= 'A'; t <= 'Z'; i++,  t++) {
            characters[i] = (char) t; // letter comes , if we put t , comes char number
            System.out.print(characters[i]+ " ");

        }
        System.out.println();
        char[] greek = new char[127];
        for (int i = 884,k=0; i <1011; i++,k++) {
            greek[k] = (char)i;
        }
        System.out.println(Arrays.toString(greek));

    }
}
