package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;

import java.time.LocalDate;

public class Student extends Person{

    // whenever have instance variable in custom class it is the better way use private access modifier
    // only disadvantage is private it is not accessed outside from the other classes
    private String name;
    private int age;

    public Student(String name, int age, char gender, LocalDate dateOfBirth) {
        super(name, age, gender, dateOfBirth);
    }

    public String getName() {
        if (name == null){
            System.err.println("name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }
        }
        if (hasDigit){ // it can be put after 18. line
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge(){ // read only
        if ( age == 0){
            System.err.println("Age has not been set");
            System.exit(1); // exit code 1 mean is something wrong, exit code 0 program exited any other issue
        }
        return age;
    }

    public void setAge(int age){ // write only
        if ( age < 1 || age > 100){ // if the age is invalid
            System.err.println("Invalid age : " + age);
            //return; // exiting the method
            System.exit(1); // program gets terminated
            // Process finished with exit code 100
        }
        this.age= age;
    }

    public static void overRidding(){
        // static method
        System.out.println("test");
    }


}
