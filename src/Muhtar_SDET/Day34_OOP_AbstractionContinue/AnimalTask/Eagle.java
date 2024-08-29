package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating Eagle food");
   }

    @Override
    public void fly() {
    }

    @Override
    public void hunt() {

    }
}
