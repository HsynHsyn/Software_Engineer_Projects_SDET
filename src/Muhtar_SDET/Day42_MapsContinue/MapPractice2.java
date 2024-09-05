package Muhtar_SDET.Day42_MapsContinue;

import Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.LocalDateIntro;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>(); // just contains the information
        // Object referans all data types (String , Character, integer)
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 10000.5);
        person1.put("hired_date", LocalDate.of(2022,12,15));
        person1.put("married", true);

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 30);
        person2.put("job_title", "Back-End- Developer");
        person2.put("salary", 99000);
        person2.put("hired_date", LocalDate.of(2022,8,15));
        person2.put("married", true);

        System.out.println(person2.get("name"));

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
        person4.put("salary", 99000);
        person4.put("hired_date", LocalDate.of(2022,8,15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 30);
        person5.put("job_title", "Back-End- Developer");
        person5.put("salary", 99000);
        person5.put("hired_date", LocalDate.of(2022,10,15));
        person5.put("married", true);

        // list of map
        List<Map<String , Object>> listOfMaps = new ArrayList<>(); // arraylist object only accepts Map object
        listOfMaps.add(person1);
        listOfMaps.add(person2);
       listOfMaps.addAll(Arrays.asList(person3,person4,person5));

        System.out.println(listOfMaps);
        System.out.println("......................................................");
        for (Map<String, Object> eachMap : listOfMaps ){
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);

            }
        }

        System.out.println(".....................2022.............................");
        // display the name sof the employee who are hired 2022

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")){
                   if (( (LocalDate)eachEntry.getValue()).getYear() == 2022 ){
                        //System.out.println(eachEntry);
                        // System.out.println(eachMap); //all info about person2
                        System.out.println(eachMap.get("name"));
                    }

                }
            }
        }

        System.out.println(".....................................................");


        listOfMaps.get(0).replace("name","Vasyl");

        listOfMaps.get(listOfMaps.size()-1).replace("salary", ( (Integer)listOfMaps.get(listOfMaps.size()-1).get("salary")) + 5000);
        // we over casted because value of salary is Integer

        listOfMaps.get(1).replace("age", ((Integer)listOfMaps.get(1).get("age") ) + 4 );

        System.out.println(listOfMaps);

        System.out.println(".....................................................");

        Map<String, Object> car1 =new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year", 2021);
        car1.put("color","Red");
        car1.put("price",45000.5);

        Map<String, Object> car2 =new LinkedHashMap<>();

        Map<String, Object> car3 =new LinkedHashMap<>();

        Map<String, Object> car4 =new LinkedHashMap<>();


        List<Map<String, Object>> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1,car2,car3,car4));










    }
}
