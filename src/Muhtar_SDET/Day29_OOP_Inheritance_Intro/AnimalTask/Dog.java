package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;

public class Dog extends Animal { // Dog is animal
    //       Child        Parent

     public void bark(){
         System.out.println(getName() + " is barking"); // getter and setter because access modifier is private
     }
}
/*
7 variables inherited
5 methods inherited
 */