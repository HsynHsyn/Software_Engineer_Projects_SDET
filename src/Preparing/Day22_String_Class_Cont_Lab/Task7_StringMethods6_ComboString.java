package Preparing.Day22_String_Class_Cont_Lab;

public class Task7_StringMethods6_ComboString {
    public static void main(String[] args) {

        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

    public static String comboString(String str1, String str2) {

        String str ="";
        if (str1.length() < str2.length()){
            str = str1 + str2 + str1;
        }else {
            str = str2 + str1 + str2;
        }return str;



    }
}
/*
Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the
inside.
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */