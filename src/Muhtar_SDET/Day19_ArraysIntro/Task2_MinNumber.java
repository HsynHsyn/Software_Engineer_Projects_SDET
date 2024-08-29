package Muhtar_SDET.Day19_ArraysIntro;

public class Task2_MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};

        int min = numbers[0]; // assume thar first element is max number

        for (int i = 1; i < numbers.length; i++) { // we used numbers[0] so we started by i=1

            if (numbers[i] < min){ // compare the element of the with current max number
                min = numbers[i]; // replace the current max number

            }

        }
        System.out.println("max = " + min);
    }
}
