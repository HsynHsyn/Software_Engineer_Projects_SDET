package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee e1 = new Employee("hakan", 5, 'M',"Student", 0, LocalDate.of(2019,07,18));
        Employee e2 = new Employee("Halime", 37, 'F',"Unemployed", 10000, LocalDate.of(1987,07,18));

        System.out.println(e1.toString());
        System.out.println(e1);
        System.out.println(e2);

    }
}
