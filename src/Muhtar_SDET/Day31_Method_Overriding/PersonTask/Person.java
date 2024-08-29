package Muhtar_SDET.Day31_Method_Overriding.PersonTask;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("Name can not be set to null or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0  || age == 0){
            System.out.println("Age can not be set to zero or negative");
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
