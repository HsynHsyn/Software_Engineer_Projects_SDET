package Muhtar_SDET.Day42_MapsContinue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("CO2" ,  "Josh");
        map.put("B03" ,  "Hakan");
        map.put("A02" ,  "Halime");
        map.put("A03" ,  "Huseyin");

        System.out.println(map.values());// [Halime, Huseyin, Hakan, Josh]
        System.out.println(map.keySet()); // [A02, A03, B03, CO2]

        System.out.println("--------------------------------");

        //putAll(); it takes another map and add to the new map
        Map<String, String> employees = new TreeMap<>();

        //employees.putAll("Test", "Test2");// gives error
        employees.putAll(map);
        //map.putAll(employees);
        System.out.println(employees);

//        System.out.println(map == employees); // false
//        System.out.println(map.equals(employees)); // true // equals can not ignore order of element



    }
}
