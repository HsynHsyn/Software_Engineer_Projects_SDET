package Preparing.Day22_String_Class_Cont_Lab;

public class Task3_StringMethods2_ExtraEnd {
    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

    }
    public static String extraEnd(String str) {

        if (str.length() < 2) {
            return "Invalid String";

        }
        String newString = str.substring(str.length() - 2);
        //return newString + newString + newString
        newString += newString + newString + newString;
        return newString;
    }
}
/*
Create a method return a new string made of 3 copies of the last 2
chars of the original string. The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */