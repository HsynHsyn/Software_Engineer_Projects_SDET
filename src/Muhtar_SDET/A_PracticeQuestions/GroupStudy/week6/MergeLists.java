package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week6;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30, 35, 50, 55, 69, 80, 90, 100));

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        // set.addAll(list3); we can use like this also because we found list3 in first solution
        System.out.println(set);


    }

}
/*
Create a class named MergeLists and write a program that merges two given lists of integers into a third list.
 Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

 */