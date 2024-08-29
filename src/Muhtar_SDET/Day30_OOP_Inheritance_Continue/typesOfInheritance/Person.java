package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;
// when you are at the other package it is needed to import class

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    /*
    // if we want to add instances to super(), instances must be used for every person, some people do not have job or schoolname

    private double salary;
    private String schoolName; */

    public Person(char gender, LocalDate DOB, String name) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age <= 0){
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);

    }
    public void drink(String drink){
        System.out.println(name + " is eating " + drink);

    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
