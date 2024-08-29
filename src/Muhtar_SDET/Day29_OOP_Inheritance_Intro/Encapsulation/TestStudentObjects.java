package Muhtar_SDET.Day29_OOP_Inheritance_Intro.Encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Hakan", 26, 'M', 'A', "MIT");
        // when input into invalid value to the object getter or setter will give an error
        student1.setSchoolName("harward"); // it is changed SchoolName
        student1.setGrade('B'); // it is changed Grade
        System.out.println(student1);
    }
}
