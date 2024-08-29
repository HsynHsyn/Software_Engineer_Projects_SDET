package Preparing.Day23_Lab_Random_Class;

public class Task13_StringMethods {
    public static void main(String[] args) {

        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
           newString = newString + str.substring(i, i+1).concat(str.substring(i, i+1));
           }
        return newString;
    }

}
/*
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */