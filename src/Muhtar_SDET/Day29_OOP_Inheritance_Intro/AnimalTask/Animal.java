package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;



public class Animal {
    //attributes;
    // it is used public class because to use from child classes
    // inheritance is maintainable
    //Object Class:  parent of all the classes ( implicitly inherited), in the lang package
    //finalize() method for deleting class (garbage collection)

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        /* this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;*/
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    //------------------------- before setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + // getClass().getSimpleName() gives the class name whichever class call
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
Custom Classes:
	0. Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()

	1. Dog
			attributes:
			methods:
					 bark()

	2. Cat
			attributes:
			methods:
				meow(), scratch()

	3. Tiger
			attributes:
		methods:
				hunt()
 */