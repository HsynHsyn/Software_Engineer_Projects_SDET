package Muhtar_SDET.Day43_CollectionsAndMaps.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_TerminalOperations {
    public static void main(String[] args) {

        // collect() , collect the element and return them as a specific collections
        List<String>  words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript",
                "Jeep", "Samsung", "Book", "Computer", "Camera"
        ));

        // it can be used other collection type like Set, List, Queue
        List<String> result = words.stream().filter( a -> a.startsWith("J")).toList();
       // List<String> result = words.stream().filter( a -> a.startsWith("J")).collect(Collectors.toList());
        Set<String> result1 = words.stream().filter(a -> a.startsWith("J")).collect(Collectors.toSet());
        System.out.println(result);
        System.out.println(result1);

        System.out.println("-------------------------------------------------------------------------------------");
        // toArray() ,
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9};

        int[] result2= Arrays.stream(nums).filter(p -> p % 2 == 0).toArray();
        System.out.println(Arrays.toString(result2));

        System.out.println("-------------------------------------------------------------------------------------");
        // count(),
        long n = Stream.of(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4).count();
        System.out.println(n);

        String[] words2 = { "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript",
                "Jeep", "Samsung", "Book", "Computer", "Camera"};

        System.out.println(Arrays.stream(words2).filter(p -> p.endsWith("a")).count());
        System.out.println(Arrays.stream(words2).filter(p -> p.equalsIgnoreCase("java")).count());

        System.out.println("-------------------------------------------------------------------------------------");
        //reduce(initialIdentity, BinaryOperator), combine(sum) the elements of stream and returns them as a single value

        int[] arr=  {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9};
        //Arrays.stream(arr).reduce(0, Integer::sum)
        int sum = Arrays.stream(arr).reduce(0, (a,b) -> a + b);
        System.out.println(sum);

        String[] str = { "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript",
                "Jeep", "Samsung", "Book", "Computer", "Camera"};

        String s = Arrays.stream(str).reduce("", (x,y) -> x + "  " +y);
        System.out.println(s);

        System.out.println("-------------------------------------------------------------------------------------");
        //forEach(), iterating each element within stream instance, it gives operation result
        //peek() gives stream instance but forEach() gives operation result

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));

        list.stream().forEach(p -> System.out.println(p));
        list.stream().forEach(System.out::println);// second solution

        list.stream().filter(p -> p > 5).forEach(p -> System.out.println(p));

        System.out.println("-------------------------------------------------------------------------------------");
        //  allMatch(), anyMatch(), nonMatch(), return boolean

        // allMatch(Predicate): checks if all the elements in the stream matches with the specified predicate
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean r1 = Arrays.stream(nums1).allMatch(p -> p < 10);
        System.out.println(r1);

        // anyMatch(Predicate): checks if any the elements in the stream matches with the specified predicate
        // one of the element matches it gives true
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean r2 = Arrays.stream(nums2).anyMatch(p -> p % 2 != 10);
        System.out.println(r2);

        // noneMatch(Predicate): checks if none the elements in the stream matches with the specified predicate
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        boolean r3 = Arrays.stream(nums3).noneMatch(p -> p > 10); //false
        System.out.println(r3);






    }
}
