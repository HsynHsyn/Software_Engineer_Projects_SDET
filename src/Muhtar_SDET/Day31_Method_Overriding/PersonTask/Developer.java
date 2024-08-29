package Muhtar_SDET.Day31_Method_Overriding.PersonTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, String employeeId, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, age, employeeId, jobTitle, companyName, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is a " + getJobTitle()  + " coding in " + getProgrammingLanguage());
    }

//    @Override
//    public String toString() {
//        return super.toString().replace("}", "") +
//                ", programmingLanguage='" + programmingLanguage + '\'' +
//                "} ";
//    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }
}
