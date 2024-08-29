package Preparing.Day22_String_Class_Cont_Lab;

public class Task2_StringMethods_MakeAbba {
    public static void main(String[] args) {

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));

    }

    public static String makeAbba(String str1, String str2) {
        String str = str1.concat(str2).concat(str2).concat(str1);
        //String str = str1 + str2 + str2 + str1;


        return str;
    }
}


/*
Create a method that accepts two strings, a and b, return the result of
putting them together in the order abba, e.g. "Hi" and "Bye" returns
"HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */