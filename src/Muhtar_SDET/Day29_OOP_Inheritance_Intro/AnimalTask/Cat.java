package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;

public class Cat extends Animal {

    public void meow(){
        System.out.println(getName() + " is meowing"); // getter and setter because access modifier is private
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }
}
