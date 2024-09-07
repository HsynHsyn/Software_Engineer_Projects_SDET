package Muhtar_SDET.Day39_Collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();// order is random, accepts null key
        set1.addAll(Arrays.asList(10,200,30,40,90));
        set1.add(null);
        System.out.println(set1);

        System.out.println("-----------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(); // keeps insertion order accepts null key


        System.out.println("-----------------------------------");
        Set<Integer> set3 = new TreeSet<>(); // Keeps sorted order does not accept duplicate
        set3.addAll(Arrays.asList(10,200,30,40,90));
        System.out.println(set3);

        System.out.println("-----------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby","C#", "C#"};
        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);

        /*
        for (String each : result) {
            System.out.println(each);

        }*/

        System.out.println(new ArrayList<>(result).get(1)); // result is collections type

        words = result.toArray(new String[0]); // converting Set to the array

        System.out.println("Words Array: " + Arrays.toString(words));
        // Any of collections type you can convert to array with toArray(); because array is faster



        System.out.println("-----------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,12,3,6,56,96,36,748,85,2,3,6,78,7,1,1,1,1,2,2,2));

                                                //  list to the set
        Set<Integer> n = new TreeSet<>(numbers); // parameters must be collections type, List is collections type,
        System.out.println(n);

    }
}
