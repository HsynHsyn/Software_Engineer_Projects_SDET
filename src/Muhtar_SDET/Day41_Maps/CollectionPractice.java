package Muhtar_SDET.Day41_Maps;

import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<List<Integer>> lists = new ArrayList<>();
        // lists.addAll(Arrays.asList(list1, list2));

        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);


        System.out.println("...................................................");

        System.out.println(lists.get(1).get(3)); // Çıktı: 10

// Tüm elemanları yazdırma
        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("----------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets); // [[], [], [], []]

        listOfSets.get(0).addAll(Arrays.asList(10,5,1,20,50,60,5)); // it will go into set
        listOfSets.get(1).addAll(Arrays.asList(11,5,1,88,20,52,12));
        listOfSets.get(2).addAll(Arrays.asList(20,5,1,47,52,36,7,7));
        listOfSets.get(3).addAll(Arrays.asList(10,7,89,580,14,8,97));

        System.out.println("...................................................");

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        //System.out.println(listOfArrays);// [[I@6f496d9f, [I@723279cf]

        System.out.println(Arrays.toString(listOfArrays.get(0))); //[1, 2, 3, 4]

        listOfArrays.get(0)[0] = 100;

        System.out.println((listOfArrays.get(0)[0])); //[1]

        System.out.println("...................................................");
        // List<List<Employee>> teams = new ArrayList<>();




    }

}
