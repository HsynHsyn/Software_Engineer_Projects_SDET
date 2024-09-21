package Muhtar_SDET.Day43_CollectionsAndMaps.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_IntermediateOperations {
    public static void main(String[] args) {
        //stream is unable to change data structures of elements
        //distinct() method -> remove duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));

        numbers = numbers.stream().distinct().collect(Collectors.toList()); // numbers.stream() -> Data type: Stream<Integer>

        System.out.println("-------------------------------------------------------------------------");
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9};
        //stream comes from Array/Collections

        nums = Arrays.stream(nums).distinct().toArray();

        System.out.println("-------------------------------------------------------------------------");
        //skip() method -> skip elements whatever you want to jump

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));

        numbers2 = numbers2.stream().skip(5).collect(Collectors.toList()); // first 5 elements will skip
        System.out.println(numbers2);

        System.out.println("-------------------------------------------------------------------------");
        //limit() method -> return first until (x) int elements
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));
       numbers3 =  numbers3.stream().limit(5).collect(Collectors.toList());
        System.out.println(numbers3);

        System.out.println("-------------------------------------------------------------------------");
        //map() method ->  transform elements in a stream.
        /*
        The map() method in Java Streams is used to transform elements in a stream.
        It applies a given function to each element of the stream and returns a new stream consisting of the transformed elements.
         */
        List<Integer> numbers4 = new ArrayList<>();
        numbers4.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));

       // numbers4.stream().map(a -> {return a * 10;});
      // numbers4 = numbers4.stream().map(a -> a * 10).collect(Collectors.toList()); // another way

        numbers4 = numbers4.stream().map(a -> { // creates new list
            if (a % 2 ==0) {
            return a * 3;
            } else {
            return a * 10;
            }
        }
        ).collect(Collectors.toList());

        System.out.println(numbers4);

        System.out.println("-------------------------------------------------------------------------");
        //filter() method -> filtering the elements
        List<Integer> numbers5 = new ArrayList<>();
        numbers5.addAll(Arrays.asList( 1, 2, 4, 5, 5, 6, 7, 7, 8, 9));

        numbers5 = numbers5.stream().filter( a-> a % 2 == 0).map(a -> a * 10).collect(Collectors.toList());
        System.out.println(numbers5);

        System.out.println("-------------------------------------------------------------------------");
        //sorted() method -> sorting the elements
        // sorted within stream instance
        List<Integer> numbers6 = new ArrayList<>();
        numbers6.addAll(Arrays.asList( 1, 2, 4, 5, 5, 6, 7, 7, 8, 9));

        numbers6 = numbers6.stream().sorted().collect(Collectors.toList());
        System.out.println(numbers6);

        System.out.println("-------------------------------------------------------------------------");
        //peek() method -> iterating elements within the stream

        List<Integer> numbers7 = new ArrayList<>();
        numbers7.addAll(Arrays.asList( 1, 2, 4, 5, 5, 6, 10, 7, 15, 9));

        numbers7 = numbers7.stream().filter(p-> p % 5 == 0).peek(a-> System.out.println(a)).collect(Collectors.toList());
        System.out.println(numbers7);

    }

}
