package Muhtar_SDET.Day31_Method_Overriding.animal_methodOverrriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal Object", "Bengle", 'F', 4, "Small", "Anim");
        Cat cat = new Cat("Emily", "Bengle", 'F', 4, "Small", "Gray");
        Dog dog = new Dog("Max", "Kanghal", 'M', 8, "Medium", "White");
        Lion lion = new Lion("Simba", "bengal", 'M', 11, "Large", "White", true);
        Eagle eagle = new Eagle("Bella", "Amercan Eagle", 'M', 15, "Medium", "Black & White");

        System.out.println(cat);
        System.out.println(dog);

        System.out.println(eagle);

        System.out.println("-------------------------------------------------------------------------------");

        cat.eat(); // if it is not overridden it will print parent class (Animal) eat() method
        animal.eat();

        System.out.println("-----------------------------------------");
        System.out.println(lion);

    }
}
