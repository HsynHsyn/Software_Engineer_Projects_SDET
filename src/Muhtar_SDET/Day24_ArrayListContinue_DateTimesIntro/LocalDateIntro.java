package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;


import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        // now();
        //LocalDate.of();
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2024-07-17

        // of()
        LocalDate birthDay = LocalDate.of(2019,7,18);// when you add wrong number it gives error
        System.out.println("birthDay = " + birthDay);

        System.out.println("***********************************************************");
        //getYear(); getDayOfMonth(); getMonth(); getMonthValue(); getDayOfWeek(); getDayOfWeek();

        System.out.println(today.getYear()); // 2024
        System.out.println(today.getMonth()); // JULY
        System.out.println(today.getMonthValue()); // 7 , gives number of months

        System.out.println(today.getDayOfWeek()); // WEDNESDAY
        System.out.println(birthDay.getDayOfWeek()); // THURSDAY

        System.out.println(today.getDayOfMonth()); // 17 , returns int
        System.out.println(today.getDayOfYear()); // 199

        System.out.println("***********************************************************");
        //plusYears();
        today = today.plusYears(1);

        System.out.println(today); // this is new object

        System.out.println("***********************************************************");
        //plusYears();plusWeeks();plusWeeks(); plusDays();
        LocalDate graduationDate = LocalDate.of(2025,6,4);
        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate);
        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);
        graduationDate = graduationDate.plusWeeks(6);
        System.out.println(graduationDate);
        graduationDate = graduationDate.plusDays(11);
        System.out.println(graduationDate);

        System.out.println("***********************************************************");
        // minusYears(); minusMonths();
        LocalDate birthDayHakan = LocalDate.of(2019,7,18);
        LocalDate olderBrotherBirthDay = birthDayHakan.minusYears(2).minusMonths(3);
        System.out.println(olderBrotherBirthDay);

        System.out.println("***********************************************************");

        //isEqual();
        LocalDate birthDay1 = LocalDate.of(1994,7,7);
        LocalDate birthDay2 = LocalDate.of(1995,6,7);

        boolean r1 = birthDay1.isEqual(birthDay2);
        System.out.println(r1); //false

        System.out.println("***********************************************************");
        // isAfter(),isBefore()
        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));// false
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));// true

        System.out.println("***********************************************************");
        //isLeapYear();
        System.out.println(LocalDate.of(2024,7,17).isLeapYear());






    }
}
