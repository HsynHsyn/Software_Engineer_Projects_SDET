package Muhtar_SDET.Day33_OOP_Abstraction.employeeTask;

public class Driver  extends Employee{


    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    //@Override
    public void work() {
        System.out.println(getName() + " is driving");

    }

}
