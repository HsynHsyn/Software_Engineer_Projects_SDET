package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student('M', LocalDate.of(2019,7,18), "hakan",'A', "A01" );
        President president = new President('M', LocalDate.of(1950,7,18), "hakan",LocalDate.of(2019,7,18) );
        Teacher teacher = new Teacher('F', LocalDate.of(2000,7,18), "hakan","Math Teacher", "0001", 95000 );

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("-------------------------------------------------------");

        student.eat("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");

    }
}
