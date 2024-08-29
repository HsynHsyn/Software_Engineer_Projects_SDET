package Preparing.Day22_String_Class_Cont_Lab;

public class Task8_StringMethods7_Left2 {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));

    }

    public static String left2(String str) {

        if (str.length() >= 2) {
            String str1 = str.substring(0,2);
            String str2 = str.substring(2);
            return str2 +str1;

        }else {
            return "Invalid value";
        }

    }
}
/*
Given a string, return a "rotated left 2" version where the first 2 chars
are moved to the end. The string length will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */