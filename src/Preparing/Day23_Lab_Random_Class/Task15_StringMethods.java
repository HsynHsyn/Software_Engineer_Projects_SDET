package Preparing.Day23_Lab_Random_Class;

public class Task15_StringMethods {
    public static void main(String[] args) {

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxxbadxx"));

    }

    public static boolean hasBad(String str) {

        if (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")) {
            return true;
        }else {
            return false;
        }

    }
}
/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.

hasBad("badxx") → true

hasBad("xbadxx") → true

hasBad("xxbadxx") → false
 */