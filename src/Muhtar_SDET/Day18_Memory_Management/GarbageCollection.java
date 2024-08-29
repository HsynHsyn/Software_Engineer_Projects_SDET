package Muhtar_SDET.Day18_Memory_Management;

import Muhtar_SDET.Day17_ClassAndObject_Intro.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        // one way to be eligible garbage collection
        String s1 = "Java";
        s1 = null; // it has not any abject in the heap
                    // "Java" will b eligible for garbage collection
                    // *** if variable is null it will not be allocating anywhere

        System.out.println(s1);
       // System.out.println(s1.replace(null, "Python")); // it gives an error because we can not use s1 because it has not anything inside

        System.out.println("===============================================");

        //second way to be eligible garbage collection
        String str1 = "Python";
        str1 = "CYDEO";
        System.out.println(str1);

        // or
        Dog dog1 = new Dog(); // this eligible for garbage collection
        Dog dog2 = new Dog();
        dog1 = dog2; //


        System.out.println("===============================================");



    }
}
