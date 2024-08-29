package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

       //  LocalDate birthDate = LocalDate.of(1990, 5, 15);  // it is used like this

        Person person1 = new Person("Hakan",'M',2000, LocalDate.of(2024,04,22),false, true);

        System.out.println(person1);
        System.out.println(person1.isMarried);
        person1.drinking("ayran");
        person1.eat("Turkish Pizza");
        person1.sleeping();
        System.out.println(person1.age);


    }
}
