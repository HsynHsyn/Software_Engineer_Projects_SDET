package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Dog extends Animal implements Playable{


    public Dog(String name, String breed, char gender, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");

    }

    @Override
    public void play() {
        System.out.println();
    }
    public void bark() {
        System.out.println();
    }
}
