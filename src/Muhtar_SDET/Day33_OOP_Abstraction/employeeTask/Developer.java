package Muhtar_SDET.Day33_OOP_Abstraction.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);

    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                "}";
    }
}
