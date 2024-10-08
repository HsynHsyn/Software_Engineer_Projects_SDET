package Muhtar_SDET.Day42_MapsContinue;

import Muhtar_SDET.Day31_Method_Overriding.PersonTask.Developer;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Car;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>(); // just contains the information
        // Object referans all data types (String , Character, integer)
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 10000);
        person1.put("hired_date", LocalDate.of(2022,12,15));
        person1.put("married", true);

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 30);
        person2.put("job_title", "Back-End- Developer");
        person2.put("salary", 100000);
        person2.put("hired_date", LocalDate.of(2022,8,15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'F');
        person3.put("age", 30);
        person3.put("job_title", "Front-End- Developer");
        person3.put("salary", 99000);
        person3.put("hired_date", LocalDate.of(2022,5,15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abdullah");
        person4.put("gender", 'F');
        person4.put("age", 30);
        person4.put("job_title", "Java- Developer");
        person4.put("salary", 77000);
        person4.put("hired_date", LocalDate.of(2022,8,15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 30);
        person5.put("job_title", "Back-End- Developer");
        person5.put("salary", 88000);
        person5.put("hired_date", LocalDate.of(2022,10,15));
        person5.put("married", true);

        //Map of maps
        Map<Integer, Map<String, Object> >  mapOfMaps = new LinkedHashMap<>();
        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        mapOfMaps.put(4, person5);

        System.out.println("mapOfMaps = " + mapOfMaps);

        System.out.println("..........................................................");

        System.out.println(mapOfMaps.get(1));
        mapOfMaps.get(1).replace("salary", 120000);
        //System.out.println("mapOfMaps = " + mapOfMaps);

        System.out.println("..........................................................");

        System.out.println(mapOfMaps.values()); // all values

        System.out.println("..........................................................");

        for (Map<String, Object> eachValue : mapOfMaps.values()) { // each values
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if (eachEntry.getKey().equals("salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue() + 10000);
                }
                
            }
        }

        System.out.println("mapOfMaps = " + mapOfMaps);

        System.out.println("..........................................................");

       //Map< Map<String, Integer>, Map<String, Integer> > mapOfMaps2 = new LinkedHashMap<>();

        Map< int[], List<Integer> > map2 = new LinkedHashMap<>();

        Map<Developer, Car> map3 = new LinkedHashMap<>();





    }
}
