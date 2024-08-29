package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class Task3_Alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26];// index: 0-25
        char[] descending = new char[26];// index: 0-25


        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++ , j++, k--) {

            ascending[i] = (char) j ; //A~Z
            descending[k] = (char) k; //Z~A


        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("----------------------------------");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {

            characters[i] = (char) i; // we assigned all char to in array

        }
        System.out.println(Arrays.toString(descending));

    }
}
