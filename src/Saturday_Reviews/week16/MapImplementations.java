package week16;

import java.util.*;

public class MapImplementations {
    public static void main(String[] args) {
        //A -> 90, B -> 80, C -> 70, D -> 60
        Map<Character, Integer> gradeScale = new HashMap<>();
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);

        System.out.println("gradeScale = " + gradeScale);
        System.out.println(gradeScale.size());

        System.out.println("A grade scale = " + gradeScale.get('A'));

        System.out.println("All grades = " + gradeScale.keySet());
        System.out.println("All values = " + gradeScale.values());

        gradeScale.remove('D');
        System.out.println("gradeScale = " + gradeScale);
        
        if (gradeScale.containsKey('A')) {
            System.out.println("A is present with value = " + gradeScale.get('A'));
        }
        
        Map<String, String> message = new HashMap<>();
        message.put("Sender", "234-765-1234");
        message.put("Receiver", "999-213-5431");
        message.put("Message", "Hi, How are you today?");

        System.out.println("message = " + message);

        System.out.println("==================================");

        Map<Integer, String> numsMap = new LinkedHashMap<>();
        numsMap.put(5, "five");
        numsMap.put(1, "one");
        numsMap.put(2, "two");
        numsMap.put(3, "three");
        numsMap.put(4, "four");
        System.out.println(numsMap);

        //slower
        for(Integer key : numsMap.keySet()) {
            System.out.println(key +" -> "+ numsMap.get(key));
        }
        //faster and more proper way of looping map
        for(Map.Entry<Integer,String> entry : numsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Lambda
        numsMap.forEach((k, v) -> System.out.println(k +" -> "+v));

        System.out.println("===========================");

        Map<Integer, Student> studentsMap = new TreeMap<>();//keys are sorted
        studentsMap.put(9, new Student("Ian", "Engineering"));
        studentsMap.put(10, new Student("Julia", "History"));
        studentsMap.put(1, new Student("Alice", "Mathematics"));
        studentsMap.put(2, new Student("Bob", "Physics"));
        studentsMap.put(3, new Student("Charlie", "Chemistry"));
        studentsMap.put(4, new Student("David", "Biology"));
        studentsMap.put(5, new Student("Eva", "Computer Science"));
        studentsMap.put(6, new Student("Frank", "Economics"));
        studentsMap.put(7, new Student("Grace", "Philosophy"));
        studentsMap.put(8, new Student("Hannah", "Psychology"));

        System.out.println("First row = " + studentsMap.get(1));

        studentsMap.forEach((row, student) -> System.out.println(row + " -> " +student));

        //Different ways of using Map, depending on the data:
        Map<String, List<String>> world = new HashMap<>();
        world.put("North America", new ArrayList<>(Arrays.asList(
                "Canada", "Mexico", "United States"
        ))); // created a new ArrayList with some String - countries

        world.put("Europe", new ArrayList<>(Arrays.asList(
                "UK", "Italy", "Spain", "France", "Germany", "Bosnia"
        )));

        List<Map<String, String>> listOfMaps = new ArrayList<>();

    }
}
