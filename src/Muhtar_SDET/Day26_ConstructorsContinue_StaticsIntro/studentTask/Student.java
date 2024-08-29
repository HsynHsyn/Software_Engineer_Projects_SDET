package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.studentTask;

// default constructor , you do not define by yourself,
// it does not have any code fragment int its body,
// if we want to use constructor own function better define ourselves
// when will the constructor get execute ? when you create the object otherwise does not run
// **** every class has to have 1(one) constructor ****

public class Student {
    public String name;
    public int age;
    public char gender;
    public String id ;


    public Student(String name, int age, char gender, String id) { // initialize
        this.name = name;
        this.age =age;
        this.gender = gender;
        this.id = id;

    }

    public void study(){
        System.out.println(name + " is studying");
        // System.out.println(this.name + " is studying"); // the only time we can use
        // this. keyword is whenever there is a local variable having the same name instance variable
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
/*
1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */