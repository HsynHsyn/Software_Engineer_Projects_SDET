package Preparing.Day25_Arrays_Cont;

public class SameArrayExample {
    public static void main(String[] args) {
        int[] array1 = {2,4,6,8};
        int[] array2 = array1;

        array1[0]= 200;
        array2[0]= 200;

        System.out.println("The contents of array1: ");

        for (int value : array1) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("The contents of array1: ");
        for (int value : array2) {
            System.out.println(value);
        }

    }
}
