package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(char gender, LocalDate DOB, String name, String jobTitle, String employeeId, double salary) {
        super(gender, DOB, name);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }
}
