package Muhtar_SDET.Day41_Maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order , Accepts one null value as a key and null values // faster than others
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 1000);
        hashMap.put("Bella",70000);
        //map1.put("Daniel", 96000); // it takes last one because it is updated
        hashMap.put("Auron", 85000);
        hashMap.put("Chris", null);
        hashMap.put("Hakan", null);     // { null, 99999, Emily=1000, Chris=null, Auron=85000, Daniel=95000, Hakan=null}
        hashMap.put(null, 99000);
        hashMap.put(null, 77777);
        hashMap.put(null, 99999); // accepts one null key and picks last null and value
                                 // -VALUES- can be duplicated -KEY- can not be duplicated
        System.out.println("hashMap = " + hashMap);

        System.out.println("......................................................................................................");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, Accepts one null value as a key and null values

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 1000);
        linkedHashMap.put("Bella",70000);
        //map1.put("Daniel", 96000); // it takes last one because it is updated
        linkedHashMap.put("Auron", 85000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Hakan", null);
        linkedHashMap.put(null, 99000);
        linkedHashMap.put(null, 77777);
        linkedHashMap.put(null, 99999); // accepts one null key and picks last null and value

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("......................................................................................................");

        Map<String, Integer> treeMap = new TreeMap<>();      // sorted order, does NOT accept null value as a key, has null values

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 1000);
        treeMap.put("Bella",70000);
        //map1.put("Daniel", 96000); // it takes last one because it is updated
        treeMap.put("Auron", 85000);
        treeMap.put("Chris", null);
        treeMap.put("Hakan", null);
       // treeMap.put(null, 99000);
       // treeMap.put(null, 77777);
      //  treeMap.put(null, 99999); // DOES NOT accept one null key but accepts null values

        System.out.println("treeMap = " + treeMap); // KEY ascending order

        System.out.println("......................................................................................................");

        Map<String, Integer> hashtable = new Hashtable<>();   // Maintains the random order, does NOT accept null value as a key,
                                                        // has null NOT values, Synchronized (Thread-Safe), it can call method so null cannot accept

        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 1000);
        hashtable.put("Bella",70000);
        //map1.put("Daniel", 96000); // it takes last one because it is updated
        hashtable.put("Auron", 85000);
        //hashtable.put("Chris", null); // DOES NOT accept KEY and VALUE which are NULL
        //hashtable.put("Hakan", null);
        // hashtable.put(null, 99000);
        // hashtable.put(null, 77777);
        // hashtable.put(null, 99999);

        try{
            hashtable.put(null, 77777); // it can not add this value to the hashtable just handled
        } catch (RuntimeException e) { // NullPointerException
            e.printStackTrace();
        }
         System.out.println("hashtable = " + hashtable); // Maintains the random order
    }
}

/*
pair: name & salary
Daniel = 95000
Emily = 10000
Bella = 85000

 */