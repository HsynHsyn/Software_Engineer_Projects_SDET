package Muhtar_SDET.A_Review.GroupStudy.week3.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations4 {
    public static void main(String[] args) {
        //addAll()
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers); // it starts index 1 // [1, 10, 20, 30, 2, 3]
        // shifts to right
        // to add arraylist to arraylist

        // list1.addAll(Arrays.asList(75,85,90,90,60,50)); // we can use this type

        // list1.addAll(numbers); // numbers array list adds to list1, adds after last index
        System.out.println(list1);

        System.out.println("--------------------------------------------------");
        //asList(); return a list , that contains the specified elements

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,90,90,60,50));
        System.out.println(scores);// [75, 85, 90, 90, 60, 50]

        System.out.println("--------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Hakan", "Halime", "Huseyin","Yunus"));
        System.out.println(students);

        students.addAll(2, Arrays.asList("test", "test1", "test2","test3")); // add to index 2
        System.out.println(students);

        System.out.println("--------------------------------------------------");


        Integer[] nums = {6,100,90,90,77,55}; // it has to be non-primitive array because collection can not convert primitive

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // Arrays.asList(nums) this is collection type
        //ArrayList<Integer> l1 = new ArrayList<>();

        l1.addAll(Arrays.asList(nums));

        System.out.println(l1); // [6, 100, 90, 90, 77, 55]

        System.out.println("--------------------------------------------------");
        //containsAll();

        ArrayList<String > employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Hakan", "Halime", "Huseyin","Yunus"));

        System.out.println(employeesList);
        boolean hasHakan = employeesList.contains("Alena"); // for one element
        System.out.println(hasHakan);

        boolean hasHakanHalime = employeesList.containsAll(Arrays.asList("Hakan","Halime")); // order does not matter// must be collection type Arrays.asList("Hakan","Halime")
        boolean hasHakanHalimeTelli = employeesList.containsAll(Arrays.asList("Hakan","Halime","Telli")); //false, one of them is absence it returns false

        System.out.println("--------------------------------------------------");

        // removeAll(), it has collection type

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,50,60,70,80,80,80,90,90,90,90));

        list.remove(0);     // just one element
        list.removeAll(Arrays.asList(80,90));// more than one element // must be used Arrays.asList();
        System.out.println(list);

        System.out.println("--------------------------------------------------");
        //retainAll(), keep element which you want others remove,
        ArrayList<String > developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Hakan", "Halime", "Huseyin","Yunus"));
        developers.retainAll(Arrays.asList("Hakan", "Halime")); // keeps [Hakan, Halime] other remove
        System.out.println(developers);

        ArrayList<String > groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("milk", "bread", "eggs", "butter", "cheese", "apples",
                "bananas", "chicken", "rice", "broccoli"));
        groceriesList.retainAll(Arrays.asList("milk", "bread", "eggs", "butter"));
        System.out.println(groceriesList);
    }
}
