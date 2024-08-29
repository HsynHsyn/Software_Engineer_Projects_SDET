package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        // LocalTime.of(); LocalTime.now();
        LocalTime starting_time = LocalTime.of(10,30);
        System.out.println(starting_time);//10:30

        LocalTime right_now = LocalTime.now();
        System.out.println(right_now); // 12:42:03.529389200

        System.out.println("===========================================");

        //LocalTime time1 = LocalTime.of(26,61); // it gives error
        LocalTime time_1 = LocalTime.of(23,59,59,59);
        LocalTime time1 = LocalTime.of(23,59,59);
        System.out.println(time1); // 23:59:59.000000059

        time1 = time1.plusHours(1);
        System.out.println(time1);

        time1 = time1.plusMinutes(1);
        System.out.println(time1);


    }
}
