package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yy/MM/dd, E"); // 2024
        //LocalDate
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2021,05,12);

        System.out.println(today.format(df));
        System.out.println("------------------------------------------------");

        //LocalTime
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));

        //LocalDateTime
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));

    }
}
