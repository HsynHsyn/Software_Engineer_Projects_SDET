package Muhtar_SDET.Day35_OOP_Polymorphism_Intro;

import Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Circle;
import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.Developer;
import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.Driver;
import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.Employee;
import Muhtar_SDET.Day33_OOP_Abstraction.employeeTask.Teacher;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask.*;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Audi;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Honda;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

       Dog dog =  new Dog("Max", "Husky", 'M', "Small","White");

       Cat cat =  new Cat("Max", "Husky", 'M', "Small","White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion =  null;

        Parrot parrot = null;

        Shark shark = null;

        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, shark, duck};

        //Animal animal = dog; // reference

        Animal animal =  new Dog("Max", "Husky", 'M', "Small","White");
        animal.eat();
        animal.drink();
        animal.sleep();

        // in polymorphism, it can not be called child class`s own methods
        // animal.play(); gives an error
        // animal.bark(); gives an error

        System.out.println("------------------------------------------------------");

        String str = "Java";
        Integer n= 100;
        Boolean r = false;
        Double d = 10.5;
        Circle circle = new Circle(4);
        Honda honda = new Honda("Pilot", "Black",2019,35000);
        Audi audi = new Audi("Q6", "White",2020,45000);
        Tesla tesla = new Tesla("Model Y", "Grey",2022,60000);
        Teacher teacher = new Teacher("james", 45,'M', "T01", "Math Teacher", 75000);
        Developer developer = new Developer("Hakan", 15,'M', "D01", "Developer", 80000, "Java");
        Driver driver = new Driver("Huseyin", 35,'M', "D01", "Truck Driver", 50000);

        // polymorphism //  Object class using is rare
        Object[] objects = {str, n, r, circle, honda, audi, tesla, teacher, developer, driver};
        System.out.println(Arrays.toString(objects));

        // benefit: more specify,
        Employee[] employees = {teacher, developer, driver};
        Employee obj = new Developer("Hakan", 15,'M', "D01", "Developer", 80000, "Java");
        //obj.work();
        // if the methods in common both Employee and Developer obj.work(); implements Developer class method
     System.out.println("------------------------------------------------------");







    }
}
