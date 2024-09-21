package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunction_FunctionalInterface {
    public static void main(String[] args) {
        //@FunctionalInterface
        //public interface BiFunction<T, U, R>
        //apply(T t, U u);
        BiFunction<int[], int[], List<Integer> > mergeTwoArrays = (a, b)-> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }

            return list;
        };

        int[] arr = {1,2,3,4,6,8};
        int[] arr2 = {1,89,95,2,32,3,8};

        List<Integer> result = mergeTwoArrays.apply(arr, arr2);

        System.out.println(result);

    }
}
