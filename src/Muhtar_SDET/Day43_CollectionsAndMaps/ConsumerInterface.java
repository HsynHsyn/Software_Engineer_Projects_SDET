package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    // takes one argument (any object) does not return a value
    // void accept(T t);

    public static void main(String[] args) {

        Consumer<int[]> printEach = arr -> {
            for (int each : arr) {
                System.out.println(each);

            }
        };
        int[] arr = {1,2,3,4,6,8};
        printEach.accept(arr);


    }
}
