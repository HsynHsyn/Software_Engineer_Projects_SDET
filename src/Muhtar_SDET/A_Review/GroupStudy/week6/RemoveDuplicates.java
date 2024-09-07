package Muhtar_SDET.A_Review.GroupStudy.week6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(set);


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