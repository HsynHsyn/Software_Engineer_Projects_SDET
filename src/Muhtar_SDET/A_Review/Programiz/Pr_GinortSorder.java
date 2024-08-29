package Muhtar_SDET.A_Review.Programiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pr_GinortSorder {
    public static void main(String[] args) {

        System.out.println(sortString("Sorting4321"));
    }

    public static String sortString(String inputString) {

        String[] array = inputString.split("");

        ArrayList<String> ginortLover = new ArrayList<>();
        ArrayList<String> ginortUpper = new ArrayList<>();
        ArrayList<String> oddNumber = new ArrayList<>();
        ArrayList<String> evenNumber = new ArrayList<>();


        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(array[i].charAt(0)) && Character.isLowerCase(array[i].charAt(0))){
                ginortLover.add(array[i]);

            } else if (Character.isLetter(array[i].charAt(0)) && Character.isUpperCase(array[i].charAt(0))) {
                ginortUpper.add(array[i]);
            } else if (Character.isDigit(array[i].charAt(0)) && (array[i].charAt(0) % 2 != 0) ) {
                oddNumber.add(array[i]);
            }
            else if (Character.isDigit(array[i].charAt(0)) && (array[i].charAt(0) % 2 == 0) ) {
                evenNumber.add(array[i]);


            }
     }
        Collections.sort(ginortLover);
        Collections.sort(ginortUpper);
        Collections.sort(oddNumber);
        Collections.sort(evenNumber);

        String ginortLoverString = ginortLover.toString().replaceAll("[\\[\\], ]", "");
        String ginortUpperString = ginortUpper.toString().replaceAll("[\\[\\], ]", "");
        String oddNumberString = oddNumber.toString().replaceAll("[\\[\\], ]", "");
        String evenNumberString = evenNumber.toString().replaceAll("[\\[\\], ]", "");

        String ginort = ginortLoverString  + ginortUpperString + oddNumberString + evenNumberString;

        return ginort ;
    }
}



// https://app.programiz.pro/community-challenges/challenge/java-ginorts-order/info
/*
Write a function to sort a string according to the ginortS order.

In ginortS,

Sort lowercase letters first.
Followed by uppercase letters.
Then odd digits.
Finally even digits.
Concatenate the sorted categories in the order: lowercase letters, uppercase letters, odd digits, and even digits.

Return the sorted string.

Assumption: The size of the string will never exceed 100 characters.

Example

For this input:
inputString = "Sorting4321"
output: ginortS1324


 */