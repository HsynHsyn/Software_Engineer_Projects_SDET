package Muhtar_SDET.Day40_Collections_Continue;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each = it.next();
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);

        System.out.println("----------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90,12,3,54,5,6,8,9,56,98,0,5));

        int n = 5;

        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);

        System.out.println(max);


    }
}
