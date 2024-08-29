package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

//the more object you create the more copy of instance variable create at the same time
public class StudentGroup { // StudentsGroup HAS A Student
    // instance variables
    public String groupName;
    public int groupId;
    public ArrayList<Student> students; // we can use in here also , students = new ArrayList<>();

    public StudentGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); // size : 0 , if we do not have arrayList object we can not use arrayList method later on

    }

    public void addStudent(Student student){ // takes one student object, and adds it to the arrayList of students
                                            //when the method run it demands arraylist
        students.add(student);
    }

    public void addStudent (Student[] students){ // TAKES ONE ARRAY OF STUDENTS,and adds the array of students to the arraylist of students
        this.students.addAll(Arrays.asList(students)); // students is local variable so we used this.students, students is Instance Variable
    }

    public void addStudent (String name, int age, char gender, String id){ // name, age, gender, id of student ingo, creates student object by using the given info
                                                                           // then adds the student object to the arraylist
        //Student student = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id));
    }

    public void removeStudents(String id){
        students.removeIf(p -> p.id.equals(id));
    } // takes the id and then removes the student object with the specified id from arraylist of students


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}

/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

	3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */