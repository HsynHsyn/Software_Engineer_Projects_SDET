package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;

public class Employee {

    private String name;
    private double salary;
    private String jobTitle;
    private int age;
    static  int test;

    public Employee(String name, double salary, String jobTitle, int age) { // is advantages
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isBlank() & jobTitle.isEmpty()){
            System.err.println("JobTitle name can not empty or blank");
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getName() { // return
        if (name == null){
            return "Unknown";

        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 0){
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
