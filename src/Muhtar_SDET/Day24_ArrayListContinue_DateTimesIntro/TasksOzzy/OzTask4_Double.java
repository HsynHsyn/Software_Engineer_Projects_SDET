package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

import java.util.Arrays;

public class OzTask4_Double {
    public static void main(String[] args) {

        int[] x = {4,5,6};
        System.out.println(doubleArray(x).toString());

    }

    public static int[] doubleArray(int[] array){

        int[] newArray = new int[array.length * 2];

        newArray[newArray.length-1] = array.length * 2;
        for (int i = 0; i < array.length-1; i++) {
            newArray[i] = 0;

        }
     return newArray;
    }
}
/*
Write a method that accepts an array and prints a new array with double the length
where its last element is the same as the original array,

int[] x = {4,5,6}; = > [0,0,0,0,0,6]
 */