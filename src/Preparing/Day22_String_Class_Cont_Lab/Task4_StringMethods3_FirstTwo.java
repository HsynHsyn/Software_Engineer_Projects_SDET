package Preparing.Day22_String_Class_Cont_Lab;

public class Task4_StringMethods3_FirstTwo {
    public static void main(String[] args) {

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("hakan"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("X"));

    }

    public static String firstTwo(String str) {

        if (str.length() < 2){
            return str ;
        }

        String newString = str.substring(0,2);

        return newString;
    }
}
/*
Given a string, return the string made of its first two chars, so the String
"Hello" yields "He". If the string is shorter than length 2, return
whatever there is, so "X" yields "X", and the empty string "" yields the
empty string "".
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */