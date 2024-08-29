package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person  {

    private char grade;
    private String studentId;

    public Student(char gender, LocalDate DOB, String name, char grade, String studentId) {
        super(gender, DOB, name);
        setGrade(grade); // it must be added setter and getter for Student instances variables
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

}
