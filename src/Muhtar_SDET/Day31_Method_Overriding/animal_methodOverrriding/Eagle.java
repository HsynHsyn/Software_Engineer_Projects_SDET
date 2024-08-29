package Muhtar_SDET.Day31_Method_Overriding.animal_methodOverrriding;

public class Eagle extends Animal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override // it is optional, proving
    public void eat() {
        System.out.println("Eagle" + getName() + " is eating snake");
    }
}
