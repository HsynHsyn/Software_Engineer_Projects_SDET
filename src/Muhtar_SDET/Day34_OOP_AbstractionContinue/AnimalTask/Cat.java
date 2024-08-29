package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");

    }

    @Override
    public void play() {

    }
}
