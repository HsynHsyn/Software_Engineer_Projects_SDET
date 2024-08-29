package Muhtar_SDET.Day32_FinalKeyword.personTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    // IF the instance variable is final, we can only getter, we can not generate setter for it
    // Constructor only runs one time for one object not more, but when variable is reassigned setter checks every time
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate datOfBirth;

    public static final int numberOfHead;

    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate datOfBirth) {
        setName(name);
        if( !(gender== 'M' || gender=='F') ){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;

        this.datOfBirth = datOfBirth;

        this.age = LocalDate.now().getYear() - datOfBirth.getYear();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDatOfBirth() {
        return datOfBirth;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public final void breath(){ // to make sure that this implementation will not change for any subclasses
        System.out.println(name + " is breathing");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", datOfBirth=" + datOfBirth +
                '}';
    }
}

/*
variables:
    name,gender, age, dateOfBirth
    numberOfHead

methods:
    eat(), drink(), sleep()
    breath()

 */
