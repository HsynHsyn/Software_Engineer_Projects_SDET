package Muhtar_SDET.Day43_CollectionsAndMaps.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9));

        System.out.println("\n");

        // Imperative approach: important , long approach
        List<Integer> result = new ArrayList<>();

        for (Integer each : numbers) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("-\n");

        System.out.println("------------------------------------------------------------");
        // Declarative approach: // Best way to write code
        List<Integer> result2 = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(result2);
    }

}
