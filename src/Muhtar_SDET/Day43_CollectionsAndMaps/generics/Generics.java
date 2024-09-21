package Muhtar_SDET.Day43_CollectionsAndMaps.generics;

import java.util.List;

public class Generics <T> {

    /*
    public static void printEach(Integer[] array) {
        for (Integer each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(Character[] array) {
        for (Character each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(Double[] array) {
        for (Double each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }*/

    // it is used static method
    /*public static <T> void printEach(T[] t){ // T-> type

        for (T each : t) {
            System.out.println(each);
        }
    }*/

    // it is used instance method
    public void printEach(T[] t){ // T-> type

        for (T each : t) {
            System.out.println(each);
        }
    }

    public void printEach(List<T> list){

        for (T each : list) {
            System.out.println(each);
        }

    }




}

