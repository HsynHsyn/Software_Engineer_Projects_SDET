package Muhtar_SDET.Day33_OOP_Abstraction.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    //@Override
    public void work() {
        System.out.println(getName() + " is testing teh application");

    }
}
