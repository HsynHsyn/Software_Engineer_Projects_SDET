package Muhtar_SDET.A_Review.GroupStudy.week3;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMedgods3 {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray(); // we created a char Arrays

        System.out.println(Arrays.toString(ch)); // toString() just call with Array objects

        System.out.println("------------------------------------------");

        String str2 =  "Today is a great day to learn java";
        String[] words = str2.split(" "); // it gives String arrays
        String[] words1 = str2.split("great");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------");

        String sentence = "I love Java";

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));

        String reversSentence = ""; // "Java love I" , we will create this sentence

        for (int i = 0; i < arr.length; i++) {
            reversSentence += arr[i] + " ";
        }
        System.out.println(reversSentence);
    }
}
