package Muhtar_SDET.Day38_Exception_Handlings;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        if (!(gender == 'M' || gender == 'F')){ // if the gender si invalid
            throw new RuntimeException("Invalid Gender " + gender ); // throw the runtime exception and crush the program
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        if (age == 0){
            throw new RuntimeException( "Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150){
            throw new RuntimeException("Invalid age : " + age); // throw run time exception and crash the program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
