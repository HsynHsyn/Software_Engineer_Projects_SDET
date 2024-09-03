package Muhtar_SDET.Day41_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));
        //list2.toArray();
        // System.out.println(Arrays.toString(list2.toArray()));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));

        // String[] str = new String[3];
        List<Integer>[] arrayOfList = new List[3];

        arrayOfList[0] = list1;
        arrayOfList[1] = list2;
        arrayOfList[2] = list3;

        System.out.println(Arrays.toString(arrayOfList)); // [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        arrayOfList[0].set(4,50);

        System.out.println(Arrays.toString(arrayOfList));

        Set<Integer>[] arrayOfSets = new Set[5]; // datatype of variable is Set

       // System.out.println(Arrays.toString(arrayOfSets)); // [null, null, null, null, null]





    }
}
