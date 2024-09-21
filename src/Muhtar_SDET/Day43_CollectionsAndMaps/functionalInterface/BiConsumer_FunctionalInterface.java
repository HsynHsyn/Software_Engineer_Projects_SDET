package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.function.BiConsumer;


public class BiConsumer_FunctionalInterface {
    public static void main(String[] args) {
        // @FunctionalInterface
        //public interface BiConsumer<T, U>
        //  void accept(T t, U u); no return

        BiConsumer<String, Integer> printMultipleTimes = (a, b)->{
            for (int i = 0; i < b; i++) {
                System.out.println(a);

            }
        };

        printMultipleTimes.accept("Wooden Spoon",7);

    }
}
