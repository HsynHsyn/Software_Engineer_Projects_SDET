package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {

        Predicate<Integer> isOdd = (a) -> { // a -> also we can use
            if (a % 2 != 0){
                return true;
            }else {
                return false;
            }
        };

        boolean r1 =isOdd.test(100);
        System.out.println(r1);

        // test() comes from Predicate Interface
        Predicate<String> isPalindrome = a -> {
            String reversed = "";
            for (int i = a.length()-1; i >= 0; i--) {
                reversed += a.charAt(i);
            }
            return a.equalsIgnoreCase(reversed);
        };

        System.out.println(isPalindrome.test("wooden spoon"));


    }
}
