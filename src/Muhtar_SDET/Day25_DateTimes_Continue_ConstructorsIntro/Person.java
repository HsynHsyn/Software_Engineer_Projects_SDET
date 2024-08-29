package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    public String name;
    public char gender;
    public int dateOfBirth,age;
    public LocalDate currentDate;
    public boolean isMarried, isEmployed;
    // public LocalDate dateOfBirth; // second option // when subtract dates , both side must be LocalDate values


    public Person(String name, char gender, int dateOfBirth, LocalDate date, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.currentDate = date;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.age = calAge(dateOfBirth);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);

    }

    public void sleeping(){
        System.out.println(name + " is sleeping" );

    }

    public void drinking(String drink){
        System.out.println(name + " is drinking " + drink);

    }

    public int  calAge(int dateOfBirth) {
        return currentDate.getYear() - dateOfBirth;
        //return Period.between(dateOfBirth, LocalDate.now()).getYears(); // second option

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", date=" + currentDate +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
}

/*

name, age,  gender, dateOfBirth, isMarried, isEmployed
Add a constructor that can set all the fields once an object is created
toString(), eat(string food), sleeping(), drink(string drink)
5 person object
 */