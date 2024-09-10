package Muhtar_SDET.Day36_OOP_Polymorphism_Continue;

import Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask.Animal;
import Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask.Cat;
import Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask.Dog;
import Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask.Iphone;
import Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask.Nokia;
import Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask.Phone;
import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.*;
import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask.AutoPilot;
import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask.Electric;
import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask.Tesla;


import java.io.DataInput;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog =  new Dog();
        Animal animal = (Animal) new Dog(); // implicit casting , no need to type (Animal)

        System.out.println("------------------------------------------------------------");

        Animal animal1 = new Dog();// upcasting == > polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark(); // not all animals have bark(); // you can use it one time

        ((Dog)animal1).bark(); // down casting

       // Dog dog1 = (Dog)animal1; // down casting // no new dog object created , // you can use it more than one
        //dog1.bark();

//        dog1.eat();
//        dog1.drink();
//        dog1.sleep();

        // ( (Cat)animal1 ).scratch(); // down casting // will give exception // Dog can not be converted to Cat,
        //because there is no relationship

        System.out.println("------------------------------------------------------------");

        Phone phone = new Nokia("Brick", "Small", "Silver", 5000);
        phone.call(999);
        phone.text(12331313);

        ( (Nokia)phone ).selfDefense(); // down casting
       // ((Iphone)phone).faceTime(123456); // gives exception // Nokia can not be converted to Iphone, because there is no relationship

        System.out.println("------------------------------------------------------------");

        Employee employee = new Developer("Hakan", 15,'M', "D01", "Developer", 80000, "Java");
        //employee.work();

        System.out.println(( (Developer)employee ).getProgrammingLanguage());

        //Tester tester = (Tester)employee;// gives error
        // Driver driver = (Driver)employee; // gives error it must be relationship

        System.out.println("--------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Green",2019,100000);
        electric.charge();
        ((Tesla)electric).selfDrive();
        ((AutoPilot)electric).selfDrive();// AutoPilot and Tesla is a relationship

        System.out.println("--------------------------------------------------");

        Employee employee1 = new Teacher("james", 45,'M', "T01", "Math Teacher", 75000);
        Employee employee2 = new Developer("Hakan", 15,'M', "D01", "Developer", 80000, "Java");
        Employee employee3 = new Driver("Halime", 35,'M', "D01", "Truck Driver", 50000);
        Employee employee4 = new Tester("Huseyin", 35,'M', "D01", "Truck Driver", 50000);

        //employee1.work(); // if reference type (Employee) and object type (Teacher) has the work() method, teacher`s work() method works,
                          // if it has not work() method Employee work() method runs
                         // if overridden,  overridden version works
        //employee2.work();
        //employee3.work();
        //employee4.work();

    }
}
