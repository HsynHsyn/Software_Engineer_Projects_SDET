package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

import java.util.ArrayList;

public class Task2_UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Hakan");
        names.add("Hakan");//1
        names.add("Halime");
        names.add("Huseyin");
        names.add("Yunus");
        names.add("Kerem");
        names.add("Merve");
        names.add("Merve");

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
               // break; // first unique element
            }

        }

    }
}
