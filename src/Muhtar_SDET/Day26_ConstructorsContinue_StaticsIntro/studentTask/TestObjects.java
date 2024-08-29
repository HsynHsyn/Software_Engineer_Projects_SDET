package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.studentTask;

import java.util.Arrays;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20, 'F', "A16"); // comes from Student Class
        Student student2 = new Student("Bob", 22, 'M', "B34");
        Student student3 = new Student("Charlie", 19, 'M', "C56");
        Student student4 = new Student("Mehmet", 21, 'F', "D85");
        Student student5 = new Student("Eve", 23, 'F', "E27");

        System.out.println(student1);

        Student[] students = {student2,student3,student4,student5}; // creating array list to add as a list

        StudentGroup group1 = new StudentGroup("Java Turtles", 1); // group created by StudentGroup

        group1.addStudent(student1); // if we want to add with object

        group1.addStudent(students); // creating array list to add as a list



        System.out.println(group1);






        // remove students
        group1.removeStudents("D85");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);

        }

        System.out.println("------------------------------------------------------------------------");
        StudentGroup group2 = new StudentGroup("Java Turtles", 1);
        StudentGroup group3 = new StudentGroup("Java Turtles", 1);
        StudentGroup group4 = new StudentGroup("Java Turtles", 1);


        StudentGroup[] groups ={ group2, group3, group4 }; // we can add like this, arrays of StudentGroup
                                                            // if we want to show all groups we can

        System.out.println(Arrays.toString(groups)); // [StudentGroup{groupName='Java Turtles', groupId=1, number of students=0},
                                                    // StudentGroup{groupName='Java Turtles', groupId=1, number of students=0},
                                                    //StudentGroup{groupName='Java Turtles', groupId=1, number of students=0}]



    }
}


/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */