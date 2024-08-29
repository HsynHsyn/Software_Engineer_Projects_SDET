package Muhtar_SDET.Day31_Method_Overriding.PersonTask;

public class Employee extends Person {

    private String employeeId,jobTitle, companyName;
    private double salary;

    public Employee(String name, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, age);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0){
            System.out.println("Salary can not be zero orn negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee`s " + getName() + " " +  getJobTitle());
    }



    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", companyName='" + getCompanyName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
