package Muhtar_SDET.Day42_MapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>(); // also we can use String rather than Character

        for (String each: str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each.charAt(0) , frequency);

        }
        System.out.println(map);

    }

}
/*
Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */