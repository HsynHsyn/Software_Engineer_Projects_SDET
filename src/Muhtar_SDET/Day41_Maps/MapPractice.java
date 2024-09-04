package Muhtar_SDET.Day41_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>(); // just contains the information
        // Object referans all data types (String , Character, integer)
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 10000.5);
        person1.put("married", true);

        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));

    }
}
