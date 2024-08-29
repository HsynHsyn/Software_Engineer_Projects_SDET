package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        // set does not return but initialize this.name, this.age etc.;
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null || name.isEmpty() || name.isBlank()){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank() ){
            System.err.println("Name can not be null or empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.err.println("Age can not be less than zero or greater than 120");;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(dateOfBirth)){
            System.err.println("Date of birth can not be after today`s date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public static void overRidding(){
        // static method
        System.out.println("test2");
    }


    public String toString() { // get has return, so it can be used in toString();
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*
name, age , gender, dateOfBirth,
    name:
    write: can not be null/empty/blank
    read ; if name is not return unknown instead

   age:
        write : age can not be less than zero or greater than 120

    gender:
        write : gender can only be 'M' or 'F'

     dateOfBirth:
            Write:  can nt be after today`s date

     Add a constructor that can set all the fields

     Add toString();


 */