package Muhtar_SDET.Day42_MapsContinue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel", 95000);
        map.put("Emily", 1000);
        map.put("Bella",70000);
        map.put("Auron", 85000);
        map.put("Brett", 99000);


        System.out.println("====================================");

        // iterating the map by the keys
        for (String eachKey : map.keySet()) {
            //System.out.println(eachKey);
            map.replace(eachKey, map.get(eachKey) * 2);
        }
        System.out.println(map);

        System.out.println("------------------------------------------");
        // iterating the map by the values

        for (Integer eachValues : map.values()) {
            System.out.println(eachValues);

        }
       System.out.println(map.values());

        System.out.println("------------------------------------------");
        // iterating the map by entries
        // every single pair is an entry

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);

        }

        System.out.println("------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue =  eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
            System.out.println("eachKey = " + eachKey);
            System.out.println("eachValue = " + eachValue);

        }

        System.out.println(map);



    }
}
