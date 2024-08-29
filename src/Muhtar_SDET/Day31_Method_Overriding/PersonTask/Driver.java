package Muhtar_SDET.Day31_Method_Overriding.PersonTask;

public class Driver extends Employee{
    public Driver(String name, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, age, employeeId, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }

}
