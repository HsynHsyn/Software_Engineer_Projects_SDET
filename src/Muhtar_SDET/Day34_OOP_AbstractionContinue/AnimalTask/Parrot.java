package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eating Parrot food");
   }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }
}
