package Muhtar_SDET.Day42_MapsContinue;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
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

        Map<String, Object>[] arrayOfMap = new Map[5];
        //System.out.println(Arrays.toString(arrayOfMap)); // [null, null, null, null, null]

        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;

        System.out.println(Arrays.toString(arrayOfMap));



    }
}
