package Muhtar_SDET.Day42_MapsContinue.tasks;

import java.util.*;

public class Task4_FrequencyOfCharacters {

    public static void main(String[] args) {
        String string = "bbcccaaaaa";

        System.out.println(frequencyOfCharacters(string));

    }

    public static Map<String,Integer > frequencyOfCharacters (String string){

        Map<String, Integer> newMap = new HashMap<>();

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(string.split("")));
        System.out.println(arrayList);


        for (String each : arrayList) {

           if (Collections.frequency(arrayList, each) > 1){
               newMap.put(each, Collections.frequency(arrayList, each));
           }
        }

        return newMap;
    }


}

/* muradil
       String str = "bbcccaaaaa";

        Map<Character, Integer> counter = new LinkedHashMap<>();

       for(int i = 0; i < str.length(); i++){
        char key = str.charAt(i);

            if(!counter.containsKey(key)){
        counter.put(key, 0);
            }

                    counter.put(key, counter.get(key) + 1);

        }
 */
/*
Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.

         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */