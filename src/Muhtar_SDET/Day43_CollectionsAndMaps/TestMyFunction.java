package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

public class TestMyFunction {
    public static void main(String[] args) {

        MyFunction cube = (a)-> {
            System.out.println(a*a*a);
        };

        cube.test(10);

        // it is like a method and body
        MyFunction oddOrEven = (a) -> {
            if (a % 2 == 0){
                System.out.println(a + " is even");
            }else {
                System.out.println(a + " is odd");
            }
        };

        oddOrEven.test(10);

    }
}
