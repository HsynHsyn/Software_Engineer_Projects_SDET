package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0); // be careful to use numbers , can not use 32 for month
        System.out.println(ends);

        starts.getDayOfMonth(); starts.getHour(); starts.getMonthValue();

    }
}
