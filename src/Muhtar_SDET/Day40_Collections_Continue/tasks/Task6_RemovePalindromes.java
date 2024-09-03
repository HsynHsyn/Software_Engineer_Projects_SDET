package Muhtar_SDET.Day40_Collections_Continue.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task6_RemovePalindromes {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String each = it.next();

            String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                  reverse += each.charAt(i);

            }

            if ( each.equalsIgnoreCase(reverse) ){
                it.remove();

            }
        }

        System.out.println(list);

    }

}
/*

Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings.
 The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}

 */