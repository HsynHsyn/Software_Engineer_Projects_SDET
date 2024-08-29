package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class Task1_UniqueCharacters1_Interview {
    public static void main(String[] args) {
    // not best approach
        String str = "aabcccd";
        String unique = "";
        // if first character and last character are same this character is unique
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) { // if true unique
                unique +=each;
            }

        }
        System.out.println("unique = " + unique);

    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */