package Muhtar_SDET.Day11_String_Continue;

import java.util.Locale;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL"; // String is immutable, you cannot change strings, you create new string
        str1 = str1.toLowerCase();

        System.out.println("-----------------------------------");

        String str2 =  "Java Programming";
        str2 = str2.toUpperCase(); // "JAVA PROGRAMMING"

        System.out.println("-----------------------------------");

        String word = "Wooden Spoon" ;
        word = word.toUpperCase();
        word = word.toLowerCase();
        System.out.println(word);

        System.out.println("-----------------------------------");

        // trim();
        String str4 = "           Cydeo School";
        str4.trim();
        System.out.println(str4); // "           Cydeo School" , it does not change because we did not assign reference variable. string is immutable

        str4 = str4.trim(); // "Cydeo School"
        System.out.println(str4);

        System.out.println("-----------------------------------");

        // indexOf();
        String sentence1 =  "Today is sunday, and we have Java Lesson";
        int index1 = sentence1.indexOf("w");
        int index2 = sentence1.indexOf('w');
        System.out.println(index1);
        System.out.println(index2);

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a');
        int secondA = s1.indexOf("a ");

        int secondB = s1.indexOf("a", 11);
        System.out.println(secondB);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        int a2 = s2.indexOf("a Python");
        int a3 = s2.indexOf("avaS");
        int a4 = s2.indexOf("aS");

        // ---------------------------------------------------------

        String w ="Java";
        System.out.println(w.indexOf('a')); // 1
        System.out.println(w.lastIndexOf('a')); // 3

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));


    }
}
