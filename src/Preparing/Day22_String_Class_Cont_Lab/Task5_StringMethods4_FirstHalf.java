package Preparing.Day22_String_Class_Cont_Lab;

public class Task5_StringMethods4_FirstHalf {
    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    public static String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            str = str.substring(0,str.length() / 2 );
            return str;
        }else{
            return "Invalid value";

        }
    }
}
/*
Given a string of even length, return the first half. So the string
"WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */