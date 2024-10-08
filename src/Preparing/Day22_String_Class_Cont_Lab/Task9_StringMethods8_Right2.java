package Preparing.Day22_String_Class_Cont_Lab;

public class Task9_StringMethods8_Right2 {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));


    }

    public static String right2(String str) {
        return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }
}

/*
Given a string, return a "rotated right 2" version where the last 2 chars
are moved to the start. The string length will be at least 2.
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
