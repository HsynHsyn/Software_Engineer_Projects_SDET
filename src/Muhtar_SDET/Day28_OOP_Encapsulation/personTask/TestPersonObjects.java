package Muhtar_SDET.Day28_OOP_Encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        // static vs instance:
        // one copy vs multiple copies

        Person person1 = new Person("Hakan");
        Person person2 = new Person("Halime",'F' );
        Person person3 = new Person("Huseyin",30 );
        Person person4 = new Person("Rukiye","English" );
        Person person5 = new Person("Yunus",25, 'M' );
        Person person6 = new Person("Merve",30, 'F', "German" );

        person4.name = "James"; // Just person4 name will be changed because name is object
        //person3.planet = "Mars"; // All instance planet name will be changed to Mars because planet is static
        //Person.planet = "Mars";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();
        person1.eat("Baklava");
        person1.drink("Water");
        person5.drink("Tea");
        person5.drink("Coffee");



    }
}
