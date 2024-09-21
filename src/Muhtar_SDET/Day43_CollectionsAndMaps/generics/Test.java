package Muhtar_SDET.Day43_CollectionsAndMaps.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

//        Generics.printEach(numbers);
//        Generics.printEach(decimals);
//        Generics.printEach(strings);
//        Generics.printEach(characters);

        System.out.println("-----------------------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50));

        List<Double> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0));

        //Generics.printEach(list1);

        System.out.println("-----------------------------------------------------");
        Generics<Integer> obj = new Generics<>();
        obj.printEach(numbers);
        obj.printEach(list);

        Generics<Double> obj2 = new Generics<>();
        obj2.printEach(decimals);

    }
}
