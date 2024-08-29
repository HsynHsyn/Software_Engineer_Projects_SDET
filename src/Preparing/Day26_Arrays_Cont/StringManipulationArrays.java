package Preparing.Day26_Arrays_Cont;

import java.util.Arrays;

public class StringManipulationArrays {
    public static void main(String[] args) {

        String[] myCars = {"Honda", "Mercedes", "BMW", "Toyota", "Ford"};

        System.out.println(myCars[0].length());
        System.out.println(myCars[1].charAt(2));
        System.out.println("==============================");

        String str = "I will display the array of the size";
        str.split(" ");                 // split method creates an array
        String[] arr = str.split(" "); // this creates an array
        System.out.println(arr.length);
        String test = Arrays.toString(arr); // this is string
        System.out.println(test);
        System.out.println(Arrays.toString(arr));

    }
}
