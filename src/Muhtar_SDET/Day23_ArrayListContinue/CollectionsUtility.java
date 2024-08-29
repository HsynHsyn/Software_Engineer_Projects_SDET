package Muhtar_SDET.Day23_ArrayListContinue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        // Collections runs in ArrayList, set, Queue
        // list is Collection , also we have Collections Utility Class
        // max(), min()
        // we can implement collection max and min method to Integer and Double Arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,50,60,70,80,80,80,90,90,90,90));
        int max = Collections.max(list); // unboxing
        int min = Collections.min(list); // unboxing

        System.out.println(max);
        System.out.println(min);
        //***********************************************************************************************//
        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<String> items = new ArrayList<>(Arrays.asList("milk", "bread", "eggs", "butter", "cheese", "apples", "bananas", "chicken", "rice", "broccoli"));

        Collections.sort(items);

        System.out.println(items);

        //***********************************************************************************************//
        System.out.println("-----------------------------------------------------------------------------");

        //reverse()
        Collections.reverse(items); // after sorted we can reverse arraylist


        //***********************************************************************************************//
        System.out.println("-----------------------------------------------------------------------------");
        //swap(); // takes  Collections.swap(arraylist, index1 ,index2);

        ArrayList<String> baskets = new ArrayList<>(Arrays.asList("peanut butter", "jelly", "whole wheat bread", "carrots", "lettuce", "cucumbers", "onions", "garlic", "salmon", "quinoa"));
        Collections.swap(baskets, 0,baskets.size()-1);
        Collections.swap(baskets, 0,2);


        System.out.println(baskets);

        //***********************************************************************************************//
        // replaceAll();  Collections.replaceAll (Arraylist name, oldValue, newValue);

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("milk", "bread", "eggs", "butter", "cheese", "apples", "milk","bananas", "chicken", "rice", "broccoli"));
        Collections.replaceAll(names, "milk", "yoghurt");
        System.out.println("names = " + names);

        //***********************************************************************************************//
        // frequency(); Collections.frequency(ArrayList name,element);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50,50,60,70,80,80,80,90,90,90,90));
        int count = Collections.frequency(numbers,50);
        System.out.println("count = " + count);

        ArrayList<String> groceries = new ArrayList<>();

        groceries.addAll(Arrays.asList("milk", "bread", "eggs", "butter", "cheese", "apples", "milk","bananas", "chicken", "rice", "broccoli"));
        int count1 = Collections.frequency(groceries,"milk" );
        System.out.println(Collections.frequency(groceries,"milk" ));
        System.out.println(count1);

        //***********************************************************************************************//


        ArrayList<Integer> uniqueNumber = new ArrayList<>(Arrays.asList(10,20,30,40,50,50,60,70,80,80,80,90,90,90,90));
        for (Integer each : uniqueNumber) {
            if (Collections.frequency(uniqueNumber,each) == 1){ // if each is 1, unique
                System.out.println(each);
            }
        }




    }

}
