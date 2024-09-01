package Muhtar_SDET.Day39_Collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();// order is random
        set1.addAll(Arrays.asList(10,200,30,40,90));
        set1.add(null);
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();


        System.out.println("-----------------------------------");
        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,200,30,40,90));
        System.out.println(set3);

        System.out.println("-----------------------------------");

    }
}
