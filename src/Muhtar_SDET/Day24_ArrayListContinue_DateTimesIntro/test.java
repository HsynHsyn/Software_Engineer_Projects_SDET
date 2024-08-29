package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate someDay = LocalDate.of(2020,8,9);
        boolean result = today.equals(someDay);
//        System.out.println(today.isBefore(someDay));
//        System.out.println(someDay.isLeapYear());
        //System.out.println(today);

//        int birthDate = today.getYear() - LocalDate.of(2000,02,01).getYear();
//        System.out.println(birthDate);
//        System.out.println(LocalDate.of(2000, 02, 01).minusYears(2).minusDays(10));

        System.out.println("======================================================");

        LocalTime today1 = LocalTime.of(10,30,59,59);
        LocalTime today3 = LocalTime.now();
        today3.plusHours(10).plusMinutes(33).plusSeconds(35);
       // System.out.println(today3);

        System.out.println("======================================================");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd, EEEE");
        System.out.println(dateTimeFormatter);
        LocalDate localDate = LocalDate.of(2024,8,9);
        System.out.println(dateTimeFormatter.format(localDate));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm, a");
        LocalTime time = LocalTime.of(10,30);
        System.out.println(timeFormatter.format(time));
        System.out.println("======================================================");

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("EEEE, yy/MM/dd, hh:mm, a");

        LocalDateTime starts = LocalDateTime.of(2023,9,6,10,30);
        System.out.println(dateTimeFormatter1.format(starts));


    }
}



