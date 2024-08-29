package Muhtar_SDET.Day35_OOP_Polymorphism_Intro;

import Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask.*;

import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask.*;
import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.*;


public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger  = new Tiger ("Max", "Husky", 'M', 5, "Small","White");
        // first there belong to the Animal class hunt() belong to Tiger class

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        boolean isAnimal = tiger instanceof Animal;
        System.out.println(isAnimal);
        System.out.println("------------------------------------------");

        //tiger.hunt(); gives error

        Animal animal = new Eagle("John", "American Falcon", 'M', 3, "Large","Black and White");
        // animal.fly(); gives an error
        animal.eat();
        animal.sleep();
        animal.drink();

        System.out.println("------------------------------------------");


        Flyable obj1 = new Eagle("John", "American Falcon", 'M', 3, "Large","Black and White");
        //obj1.eat();
       // obj1.drink();
       // obj1.sleep();
        obj1.fly(); // Flyable has fly();
        System.out.println(obj1.canFly);

        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar =null;



        Flyable[] birds = {parrot, eagle, duck};
        Swimmable[] fish = {shark, dolphin, duck, cydeoCar};
        Playable[] friendlyAnimals = {dog, cat, dolphin};

        // boolean isAnimal = cydeoCar instanceof Animal; // false // instanceof , ``is a`` relationship is must

        boolean isAnimal3 = dog instanceof Animal; // false

        System.out.println("isAnimal" + isAnimal);

        System.out.println("---------------------------------------------------------------------");

        Car car = new Tesla("Tesla","Model Y", "White", 2020,55555);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark  = car instanceof AutoPark;
        boolean hasAutoPilot  = car instanceof AutoPilot;

        boolean isAnimal1 = cat instanceof Animal;
        boolean isAnimal2 = dolphin instanceof Animal;

        System.out.println("isTesla = " + isTesla);// true
        System.out.println("isAudi = " + isAudi); // false
        System.out.println("isElectricCar = " + isElectricCar); // true
        System.out.println("hasAutoPark = " + hasAutoPark); // true
        System.out.println("hasAutoPilot = " + hasAutoPilot); // true
        System.out.println("isanimal " + isAnimal);
        System.out.println("isanimal1 " + isAnimal1);
        System.out.println("isanimal1 " + isAnimal2);







    }
}
