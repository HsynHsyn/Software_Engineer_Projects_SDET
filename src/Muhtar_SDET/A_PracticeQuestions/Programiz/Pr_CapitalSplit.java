package Muhtar_SDET.A_PracticeQuestions.Programiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr_CapitalSplit {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(splitAtCapitals("helloWorld")));
    }

    public static String[] splitAtCapitals(String str) {
        ArrayList<String> parts = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {

                parts.add(str.substring(start, i));
                start = i;
            }
        }


        parts.add(str.substring(start));


        return parts.toArray(new String[0]); // so important
    }
    }

