package Muhtar_SDET.Day43_CollectionsAndMaps.generics;

public class MyFunctionTest {
    public static void main(String[] args) {

        MyFunction<Integer> displayCube = (a) -> { // lambda expression
            System.out.println(a * a * a);
        };

        displayCube.function(5);

        MyFunction<String> thirdCharacter = a -> {
            // body of the lambda expression

            System.out.println("Third Character is " + a.charAt(2));
        };
        thirdCharacter.function("hakan");

        /* above statement is the same as below statement
        MyFunction<String> thirdCharacter = new MyFunction<String>() {
        @Override
        public void apply(String a) {
        System.out.println("Third Character is " + a.charAt(2));
    }
};
         */
    }
}
