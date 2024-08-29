package Preparing.Day22_String_Class_Cont_Lab;

public class Task6_StringMethods5_WithoutEnd {
    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
        System.out.println(withoutEnd("a"));

    }
    public static String withoutEnd(String str) {
        if (str.length() >=2) {

            str = str.substring(1,str.length()-1);

            return str;

        }else {
            return "invalid value";
        }
    }
}

/*
Given a string, return a version without the first and last char, so
"Hello" yields "ell". The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */