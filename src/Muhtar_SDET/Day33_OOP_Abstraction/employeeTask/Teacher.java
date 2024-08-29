package Muhtar_SDET.Day33_OOP_Abstraction.employeeTask;

public class Teacher extends Employee{
    // it can never be abstract because we will create objects


    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
   }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");

    }
}
