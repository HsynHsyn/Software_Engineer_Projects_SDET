package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // add method does not change element just shifted
        list.add(10); //converted to wrapper clas autoboxing // index number = 0
        list.add(20);// index number = 1
        list.add(30);// index number = 2
        list.add(10); // accepts duplicate element // index number = 3
        list.add(4,100);
       // list.add(5.5); // compiler error because of Integer we have
       // list.add(1,50); //indexes shift left to the right // [10, 50, 25, 20, 30, 10]
        //list.add(2,25); //  [10, 50, 25, 20, 30, 10]
        System.out.println(list);

        System.out.println("---------------------------------------");
        //get() method
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("muhammet");
        studentList.add("Abdullah");
        studentList.add("Hakan");
        studentList.add("Halime");
        studentList.add("Huseyin");
        System.out.println(studentList.size());
        System.out.println(studentList); // cannot use Arrays.toString() because this is array list

        System.out.println(studentList.get(0)); // index: number
        System.out.println(studentList.get(1));
        System.out.println(studentList.get(studentList.size() -1 )); // last student name





    }
}
