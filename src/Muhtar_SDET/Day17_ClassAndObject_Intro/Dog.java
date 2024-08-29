package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class Dog { // this is just class example we will not run and we do not have main method

    public String name; // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String colour;

    public void setInfo(String name,String breed, char gender, int age, String size, String colour) {
        this.name = name; // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.colour = colour;

    } // this method can help us to set all the info of the dog at once

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking water");
    }

//    public String toString(){ // whenever you want ro print object this method run, if this method do not exist it give location of object
//        return "Dog Name : " + name + "dog gender: " + gender;
//    }

    public String toString() { // to hold back getting hash-codes when we print the class object
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
