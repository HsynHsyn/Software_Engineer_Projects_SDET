package Muhtar_SDET.Day41_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        //put(key, value): inserts the given key and value to the Map as a pair (entry)
        //can also be used for updating *** the values of existing keys ***

        // KEYs unchangeable, VALUE s changeable
        Map<String, String> map = new TreeMap<>();
        map.put("CO2" ,  "Josh");
        map.put("B03" ,  "Hakan");
        map.put("A02" ,  "Halime");
        map.put("A03" ,  "Huseyin");
        map.put("A04" ,  "Huseyin");
        map.put("A05" ,  "Huseyin");
        map.put("A06" ,  "Huseyin");
        map.put("A07" ,  "Huseyin");

        // size(): returns the total number of pairs
        System.out.println(map.size());

        map.put("A04" , "Lucy"); // changes values
        System.out.println(map);

        // get(key): returns the value of the specified key
        System.out.println(map.get("A04"));

        // replace(key, newValue): replaces the value of the specified key with the new value // FASTER than put() to change values
        map.replace("CO2", "Aseel");
        System.out.println(map);

        map.put("CO8888" ,  "changed"); // if put method does not find key , it will insert to the set or if it finds then will change
        map.replace("cccc", "Aseel"); // if replace method does not find key , it will not insert to the set
        System.out.println(map);

        //remove(key): removes the pair with the matching key from the map
        map.remove("A04");
        System.out.println(map);

        //containsKey(key): returns true if the specified key is included in the map, otherwise returns false
        System.out.println(map.containsKey("A05")); //true

        //containsValue(Value): returns true if the specified Value is included in the map, otherwise returns false
        System.out.println(map.containsValue("Halime")); //true
        System.out.println(map.containsValue("Muhtar")); //false

        //equals()
        System.out.println(map.equals(map));

        map.clear();
        System.out.println(map); //{}





    }
}
