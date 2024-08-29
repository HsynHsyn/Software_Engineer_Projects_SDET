package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Task4_StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: "); // getting number students
        int numberOfStudents = input.nextInt();


        String[] studentNames = new String[numberOfStudents]; // numberOfStudents determines studentNames`s length
        int[] scores = new int[studentNames.length];
        char[] grades = new char[studentNames.length];


        String result = ""; // initialization for printing all result
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Enter student name: "); // asking all info
            studentNames[i] = input.next();

            System.out.println("Enter student score: ");// asking all info
            scores[i] = input.nextInt();

            System.out.println("Enter student grade: ");// asking all info
            grades[i] = input.next().charAt(0);

            result += studentNames[i] + "'s score is " + scores[i] + ", and grades is " + grades[i] +"\n"; // gathering all printing info

        }

        System.out.println("listed students information: " + result);







    }
}

/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   4.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */