package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

       // Object Class:  parent of all the classes ( implicitly inherited)

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'F', 4, "Large","White");


        Cat cat  = new Cat();
        cat.setInfo("Felicia", "stray", 'M', 3, "Small","Grey");

        Tiger tiger = new Tiger();
        tiger.setInfo("Share", "Bengal", 'F', 15, "Big","Orange");



        System.out.println("-------------------------------------------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("-------------------------------------------------------------------------");

        dog.bark();
        cat.meow();
        tiger.drink();

        //dog.meow(); gives error
        //dog.hunt(); gives error

        System.out.println("-------------------------------------------------------------------------");

        //System.out.println(dog.name);// gives an error
        //System.out.println(cat.breed);// gives an error
        //System.out.println(tiger.age);// gives an error

        // have to use setter and getter because access modifier is private
        System.out.println(dog.getName());
        System.out.println(cat.getGender());
        cat.setColor("grey");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


    }


}
