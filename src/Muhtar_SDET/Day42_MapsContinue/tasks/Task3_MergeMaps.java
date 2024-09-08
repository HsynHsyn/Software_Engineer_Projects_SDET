package Muhtar_SDET.Day42_MapsContinue.tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task3_MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new TreeMap<>();
        map1.put('A', 10);
        map1.put('B', 20);
        map1.put('C', 20);
        map1.put('D',80);

        Map<Character, Integer> map2 = new TreeMap<>();
        map2.put('B', 30);
        map2.put('C', 40);
        map2.put('E', 40);


        Map<Character, Integer> mergeMap = new TreeMap<>();

        mergeMap.putAll(map1);

        for (Map.Entry<Character, Integer> map1Entry : map1.entrySet()) {
            for (Map.Entry<Character, Integer> map2Entry : map2.entrySet()) {
                if (map1Entry.getKey() == map2Entry.getKey()){
                    mergeMap.put(map1Entry.getKey(), map1Entry.getValue() + map2Entry.getValue());
                }
               else {
                   if (! mergeMap.containsKey(map2Entry.getKey()) ) {
                        mergeMap.put(map2Entry.getKey(), map2Entry.getValue());
                    }

                   //
                }
            }

        }

        System.out.println(mergeMap);

    }


}


/*
Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}

 */