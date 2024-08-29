package Muhtar_SDET.Day31_Method_Overriding.animal_methodOverrriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // override method`s access modifier must be more same or more visible than parent class method access modifier
    @Override
    public void eat(){
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours in a day" );
    }

    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }
}
