package Muhtar_SDET.Day40_Collections_Continue.tasks;

import java.util.*;

public class Task2_MergeLists {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 1000, 40, 50, 60, 70));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        List<Integer> list3 = new ArrayList<>();

        for (Integer each : list1) {
            if ( !list3.contains(each) ){
                list3.add(each);
            }
        }

        for (Integer each : list2) {
            if ( !list3.contains(each) ){
                list3.add(each);
            }
        }

        Collections.sort(list3);

        System.out.println(list3);

        System.out.println("////////////////////////////////////////////////////////////////////////");

        // approach 2
        Set<Integer> set = new TreeSet<>(); // TreeSet maintains the sorted (Ascending) order
        set.addAll(list1);
        set.addAll(list2);
        // set.addAll(list3); we can use like this also because we found list3 in first solution
        System.out.println(set);

        //Collections.sort(set); //it is not allowed because set elements have not order

        System.out.println("////////////////////////////////////////////////////////////////////////");
        // approach 3

        Set<Integer> uniqueNums = new LinkedHashSet<>();
        uniqueNums.addAll(list1);
        uniqueNums.addAll(list2);

        System.out.println(uniqueNums);

        List<Integer> uniqueList = new ArrayList<>(uniqueNums);
        System.out.println(uniqueList);




    }
}
/*
2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list.
 Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
 */