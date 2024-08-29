package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1_FindDate  {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h : m a, MMM/d/yyyy ");

        LocalDateTime time = LocalDateTime.of(2020,11,24,1,0); // must type order year-month-day-hour-minute

        System.out.println(time.format(dtf));
    }
}

/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */