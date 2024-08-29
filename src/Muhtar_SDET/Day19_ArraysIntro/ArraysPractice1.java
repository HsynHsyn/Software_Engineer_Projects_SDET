package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Hakan";
        myGroup[1] = "Huseyin";
        myGroup[2] = "Telli";
        myGroup[3] = "Rukiye";
        myGroup[myGroup.length-1] = "Halime";
        myGroup[3] = "Hamza";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("_-----------------------------------");

        for (int i = myGroup.length-1; i >=0 ; i--) {

            System.out.println(myGroup[i]);
        }

        System.out.println("_-----------------------------------");
//        for (int i = myGroup.length - 1; i >= 0; i--) { // forr- r mean is reverse
//        }
        //for (int i = 0; i < myGroup.length; i++) {// fori- r mean is reverse
       // }


    }
}
