package Muhtar_SDET.Day43_CollectionsAndMaps.enums;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Day day = Day.MONDAY;
        Day day1 = Day.TUESDAY;

        switch (day) {
            case MONDAY -> System.out.println("It is Monday");

            case TUESDAY -> System.out.println("It is Tuesday");

        }

        System.out.println(day.compareTo(day1));// it returns -1 or 0

        Day[] weekdays =  Day.values();
        System.out.println(Arrays.toString(weekdays)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

    }
}
