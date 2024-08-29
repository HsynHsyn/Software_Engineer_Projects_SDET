package Muhtar_SDET.Day20_ArraysContinue_ForEach;

public class ForEachLoop {
    public static void main(String[] args) {

        // it is used with Array, Collection or Map
        int[] numbers = {10,20,30,40,50,60};
        // one way
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("----------------------------------");
        // second way
        for ( int each : numbers){// must start from first element to last element // can not change
            System.out.println(each); // do not have index number (iteration order and number of iterations are fixed )
        }                            //

    }
}
