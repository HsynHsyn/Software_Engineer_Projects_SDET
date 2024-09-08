package Muhtar_SDET.Day42_MapsContinue.tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task2_InvertMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");

        System.out.println(inverted(map1));

    }

    public static Map<String, Integer> inverted(Map<Integer, String> map){

        Map<String, Integer> newMap = new TreeMap<>();

        for (Map.Entry<Integer, String> entrySet : map.entrySet()) {

            newMap.put(entrySet.getValue(),entrySet.getKey() );

        }


        return newMap;
    }

}


/*
 Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */