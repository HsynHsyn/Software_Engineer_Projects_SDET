package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        String[] a1 =  {"Umran", "Mehmet"}; // in java one reference variable represents one object but objects can represent more than one reference number

        a1 = new String[]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1));


    }
}
