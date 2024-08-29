package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
