package Muhtar_SDET.Day32_FinalKeyword.personTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersonObject {
    public static void main(String[] args) {

        // we can not change gender, age, dateOfbirth
        Person person = new Person("Hakan", 'M', LocalDate.of(2019,07,18));
        System.out.println(person);


        Employee employee = new Employee("Halime", 'F', LocalDate.of(1987,03,02), "Turkish Teacher", 100000);
        System.out.println(employee);




    }
}
