package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week6;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> commonElements = new TreeSet<>();

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set1);
        list.addAll(set2);


        list.removeIf(p -> Collections.frequency(list,p) < 2);

        commonElements.addAll(list); /// ******

        System.out.println(list);
        System.out.println("commonElements = " + commonElements);

        System.out.println("-----------------------------------------------------");

        for (Integer each : list) {
            if(Collections.frequency(list,each) > 1){
                commonElements.add(each);
            }

        }

        System.out.println(commonElements);


    }
}
/*
Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers
and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */