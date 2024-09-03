package Muhtar_SDET.Day40_Collections_Continue.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task5_Anagram {
    public static void main(String[] args) {


        String str1 = "xyze";
        String str2 = "xyzd";

        String[] str1Array = str1.split("");
        String[] str2Array = str2.split("");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1Array));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2Array));


        boolean result = true;
        for (String each : list1) {

            if ( !list2.contains(each) ){
                result = false;
            }

        }
        System.out.println(result);

        System.out.println(".......................................................");

       /*
        //second approach

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2) ? "Anagram" : "Not Anagram"); */


    }

}

/*
Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
 considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */