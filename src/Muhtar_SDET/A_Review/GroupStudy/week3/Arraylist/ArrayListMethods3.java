package Muhtar_SDET.A_Review.GroupStudy.week3.Arraylist;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("Paper Towels");
        groceryList.add("Apples");
        groceryList.add("eggs");
        groceryList.add("Cooking Oil");
        groceryList.add("Apples");


        System.out.println("groceryList = " + groceryList);

        System.out.println("------------------------------------");
        //set()
        groceryList.set(2,"Pear"); // index number, element// set() does not change the size
        groceryList.add(2,"chicken"); // add() increases size

        System.out.println(groceryList);

        System.out.println("------------------------------------");
        //remove(), able to remove both index and object

        groceryList.remove(0); // index
        groceryList.remove("Cooking Oil"); // remove object, does not remove more than one
        boolean test = groceryList.remove("tttttt"); // returns true or false
        System.out.println(test); //

        System.out.println("------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // numbers.remove(20); // do not have index 20 will give error


        numbers.remove(Integer.valueOf(20)); // wrapper class object autoboxing

        boolean r1 = numbers.remove(Integer.valueOf(20)); // it checks whether remove
        numbers.remove(2);
        System.out.println(numbers);

        System.out.println("------------------------------------");
        //clear
        numbers.clear(); // size will be 0,
        System.out.println(numbers);

        System.out.println("------------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Hakan");//1
        names.add("Halime");
        names.add("Huseyin");
        names.add("Yunus");

        System.out.println(names.indexOf("Yunus"));
        System.out.println(names.lastIndexOf("Hakan")); // last to the first

        System.out.println("------------------------------------");
        //contains(), verifying elements which are in the arraylist
        boolean hasMuhtar = names.contains("muhtar");
        boolean hasHalime = names.contains("Halime");

        System.out.println(hasMuhtar);
        System.out.println(hasHalime);

        System.out.println("------------------------------------");
        //equals() comparing 2 arraylist are having the same element and elements index numbers must be same

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);// output 10
        System.out.println(list2);// output 10

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);
        System.out.println(l1 == l2); // true
        System.out.println(l1.equals(l2)); // true , comparing the element with indexes

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println(n1.equals(n2)); // index numbers are not same false


        System.out.println("------------------------------------");
        //isEmpty() checks whether arraylist is empty or not

        System.out.println("------------------------------------");
        // bulk methods // common all other operations
        System.out.println(n2.remove(2));
    }
}
