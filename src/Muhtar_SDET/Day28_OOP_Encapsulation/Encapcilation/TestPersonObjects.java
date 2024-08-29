package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;


import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        LocalDate dateOfBirth = LocalDate.of(1986,03,12);

        Person person1 = new Person("hakan",5,'m',dateOfBirth);
        Person person2 = new Person("halime",35,'f',dateOfBirth);



        person1.setDateOfBirth(dateOfBirth);
        System.out.println(person1.getDateOfBirth());

        System.out.println("******************************");

        person2.setAge(35);
        System.out.println(person2.getAge());

    }
}
