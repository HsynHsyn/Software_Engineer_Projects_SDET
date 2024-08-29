package Preparing.Day22_String_Class_Cont_Lab;

public class Task10_StringMethods9_FrontAgain {
    public static void main(String[] args) {

        System.out.println(frontAgain("edited"));
    }

    public static String frontAgain(String str) {
        return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }
}
/*
Given a string, return true if the first 2 chars in the string also appear at
the end of the string, such as with "edited".
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */