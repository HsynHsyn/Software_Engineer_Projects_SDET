package Muhtar_SDET.Day28_OOP_Encapsulation.personTask;

public class Person {

    // *** static vs instance:
    // *** one copy vs multiple copies

    /* this way it is just achieved from personTask package
    *** if we use `private`  is just achieved from Person Class
    String name, language;
    int age;
    char gender;
    String ;*/


    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet ;
    public static boolean isHuman ; // if variables need to have more steps we should use like this others like ``public static boolean isHuman =true ;``
    public static boolean hasNose ;
    public static int numberOfWings, numberOfHeads;

    // Constructor can not call or contain itself
    public Person(String name) {// Allow us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) {// Allow us to create Person object just by setting the name and age of the person
        this(name);
        this.age = age;
    }

    public Person(String name,String language) { // Allow us to create Person object just by setting the name and language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    // one constructor it can not call more than one constructor// constructor is special
    public Person(String name, int age, char gender) {
        this(name,age);
        //this(name); // gives an error
        //this(name,gender); // gives an error
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name,age,gender);
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;
    }

    public static  void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println(name  + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name  + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +

                '}';
    }
}

/*
Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHeads

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()



Custom Class:
	1. Class & Object
	2. Instance Variables & instance methods
	3. Statics (Static Variables, Static Methods, static Block)
	4. Constructor
 */