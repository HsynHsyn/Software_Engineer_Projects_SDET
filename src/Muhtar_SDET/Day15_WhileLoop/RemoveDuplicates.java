package Muhtar_SDET.Day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbbcccc";

        String result ="";
        for (int i = 0; i < str.length() ; i++) {

            for (int j = 1; j <= i ; j++) { // i: index number of str

                char each = str.charAt(i);

                if (! result.contains("" + each)) // if the string result does not contain the character of string str yet
                    result += each; // then we will add
                }
            // if the character is not contained yet in the new string then we will add it to the new string

            }
        System.out.println(result);
    }

}


/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */