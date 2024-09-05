package Muhtar_SDET.Day42_MapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("-------------------------------------------");
        // How many female and male employees in the map?
        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")){
                countFemaleEmployee ++;
            }else {
                countMaleEmployee ++;
            }
            
        }
        System.out.println("countFemaleEmployee = " + countFemaleEmployee);
        System.out.println("countMaleEmployee = " + countMaleEmployee);

        System.out.println("-------------------------------------------");

        // display the names all the female employees
        /*
        for (String name : employeeMap.keySet()){
            String gender = employeeMap.get(name);
            if (gender.equals("F")){
                System.out.println(name);

            }
        }*/

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
            
        }

        System.out.println("-------------------------------------------");
        // Update all the "M" values with "Male", "F" values with "Female".

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);







    }
}
