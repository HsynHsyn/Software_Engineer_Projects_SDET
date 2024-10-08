package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class Task1_RemoveExtraSpaces {
    public static void main(String[] args) {

       String str = "  Hello world      I      love      Java    ";
       String[] words = str.split(" ");

        str = "";
        for (String each : words) {
            if (!each.isEmpty()){
                str += each + " ";
            }
        }
        str = str.trim();
        System.out.println("str = " + str);
    }
}

/*
Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */