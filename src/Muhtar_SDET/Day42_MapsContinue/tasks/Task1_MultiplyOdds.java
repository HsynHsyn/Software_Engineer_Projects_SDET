package Muhtar_SDET.Day42_MapsContinue.tasks;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1_MultiplyOdds {
    public static void main(String[] args) {

        Map<Character, Integer> multiplyOdd = new LinkedHashMap<>();
        multiplyOdd.put('a',1);
        multiplyOdd.put('b',2);
        multiplyOdd.put('c',3);
        multiplyOdd.put('d',4);
        multiplyOdd.put('e',5);

        for (Map.Entry<Character, Integer> characterIntegerEntry : multiplyOdd.entrySet()) {
            System.out.println(characterIntegerEntry.getKey()+ " = " +characterIntegerEntry.getValue() * 2);

        }


        System.out.println("2......................................");

        for (Character value : multiplyOdd.keySet()) {
            multiplyOdd.replace(value, multiplyOdd.get(value) * 2);

        }

        System.out.println(multiplyOdd);

        System.out.println("-----------------------------------------------------");

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);

        for(Map.Entry<Character, Integer> each : map.entrySet()){
            if(each.getValue() % 2 == 1){
                each.setValue(each.getValue() * 2);
            }
        }

        System.out.println("----" + map);

    }
}
/*
Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}
 */