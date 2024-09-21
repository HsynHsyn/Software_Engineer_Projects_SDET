package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterface {
    public static void main(String[] args) {

        // @FunctionalInterface
        //public interface BiPredicate<T, U> {

        //boolean test(T t, U u);
        BiPredicate<int[], Integer> contains = (a,b)->{
            for (int each : a) {
                if (each == b){
                    return true;
                }
            }
            return false;
        };

        int[] nums = {1,2,3,4,6,8};

        boolean r1 = contains.test(nums, 600); // if it has just one element contains in te nums true other false

        System.out.println(r1);


    }
}
