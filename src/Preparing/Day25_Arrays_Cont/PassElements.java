package Preparing.Day25_Arrays_Cont;

public class PassElements {
    public static void main(String[] args) {
        int[] numbers = {5,10,20,47,48,89,50};

        for (int value : numbers){
            //System.out.println(value);
            showValue(value);
        }
    }

    public static void showValue(int value) {
        System.out.print(value);
    }
}
