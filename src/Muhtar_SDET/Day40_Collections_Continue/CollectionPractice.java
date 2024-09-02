package Muhtar_SDET.Day40_Collections_Continue;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.size();
        collection.add(100);
        collection.addAll(Arrays.asList(100,2000,100,3000,500,600));

        System.out.println(collection);
        //down casting
        System.out.println(((ArrayList<Integer>) collection).get(2)); // gives error, we dont have get() reference type
        // System.out.println( ((Stack)collection).pop() ); Class cast excetion gives because Arraylist and Stack do not have is a relationship

        System.out.println("=======================================================");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,2000,100,3000,500,600,600));
        System.out.println(collection2);

        // System.out.println( ((ArrayList)collection2).get(4)); gives error

        System.out.println(new ArrayList<>(collection2).get(4));
        List<Integer> l = new ArrayList<>(collection2);



    }
}
