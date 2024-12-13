package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week3.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion2 {
    public static void main(String[] args) {
        //-------disadvantages and advantages-----------------------//
        // array =  supports primitive and non-primitive type and multidimensional , fast
        // disadvantages is size of array, size has to be fixed, not available more method
        // collection size is dynamic, many ready method has,
        // disadvantages, not support primitive , just support non-primitive, as not fast as array

        // ***************************************************************************************** //

        //Array to ArrayList
        String[] arr = {"A","B","C","D"}; // string is not a primitive, so we can convert it to a list

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        // ***************************************************************************************** //

        System.out.println("---------------------------------------------------------");
        // toArray() arraylist`s method
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C++"));

        String[] languages = list2.toArray(new String[0]); // 0 is temporary, elements numbers are belong to list2
        //String[] languages = list2.toArray(new String[list2.size()]);
        System.out.println(Arrays.toString(languages));

        // ***************************************************************************************** //
        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Integer[] n = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(n));
        // ***************************************************************************************** //
    }
}
