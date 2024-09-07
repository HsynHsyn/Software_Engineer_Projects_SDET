package Muhtar_SDET.Day40_Collections_Continue.tasks;

import java.util.*;

public class Task1_RemoveDuplicates {
    public static void main(String[] args) {

        // implements the SortedSet Interface
        // Maintains the sorted(Ascending) order
        // Does not accept null values (if add null it  will give NullPointerException )

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(set);

        System.out.println("---------------------------------------------------------");
        //second solution
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        List<Integer> unique2 = new ArrayList<>();


        for(int each : nums2){
            if(!unique2.contains(each)){
                unique2.add(each);
            }
        }

        Collections.sort(unique2);
        System.out.println(unique2);

    }
}

/*
 Create a class named RemoveDuplicates and write a program that takes a list of integers,
 removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */