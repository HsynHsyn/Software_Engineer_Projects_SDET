package Muhtar_SDET.Day42_MapsContinue.tasks;

import java.util.*;

public class Task5_UniqueCharacters {
    public static void main(String[] args) {

        String string = "bbcccaaaaade1klme";
        System.out.println(uniqueCharacters(string));
    }

    public static Map<Character, Integer> uniqueCharacters(String string) {

        Map<Character, Integer> newMap = new TreeMap<>();

        // adding element to newMap
        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i);
            if (!newMap.containsKey(key)) {
                newMap.put(key, 0);
            }

            newMap.put(key, newMap.get(key) + 1);
        }
        // Iterator is always best practice for remove element

        Iterator<Map.Entry <Character, Integer> > iterator = newMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (entry.getValue() != 1) {
                iterator.remove();
            }
        }

        return newMap;
    }
}



/*
Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */