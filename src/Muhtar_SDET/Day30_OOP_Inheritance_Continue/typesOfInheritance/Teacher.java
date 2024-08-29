package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{

    public Teacher(char gender, LocalDate DOB, String name, String jobTitle, String employeeId, double salary) {
        super(gender, DOB, name, jobTitle, employeeId, salary);

    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }


}
