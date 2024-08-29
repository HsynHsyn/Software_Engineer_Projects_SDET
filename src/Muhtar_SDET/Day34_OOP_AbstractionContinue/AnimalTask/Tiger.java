package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName() + " is eating Tiger food");
   }

    @Override
    public void hunt() {

    }
}
