package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class Task2_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);// 1 2 3 6
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (result.contains(""+ch)){ // if the character is already included in the result
                continue; // skip that character
            }
            result += ch + "" + count;
        }

        System.out.println(result);
    }

}
/*
Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
