package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task5_CydeoStudent {

    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "English" ;

    public Task5_CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public String study(){
        return name + " is studying";
    }

    public String attendClass(){
        return name + " is attending the live class.";
    }

    public static String printSchoolName(){
        return schoolName;
    }

    public static String programmingLanguage(){
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return "Task5_CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", attendClass=" + attendClass() +
                ", printSchoolName=" + printSchoolName() +
                ", programming Language=" + programmingLanguage() +
                ", study=" + study() +

                '}';
    }
}
