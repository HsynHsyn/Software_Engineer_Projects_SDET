package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = { new Person(),new Person(),new Person(),new Person(),new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Emily", 'F', LocalDate.of(1992, 5, 14));
        people[2].setInfo("Michael", 'M', LocalDate.of(1987, 11, 30));
        people[3].setInfo("Sophia", 'F', LocalDate.of(1995, 8, 22));
        people[4].setInfo("James", 'M', LocalDate.of(1990, 4, 18));


        ArrayList<Person> studentList = new ArrayList<>();   // addAll() only takes collection type
        studentList.addAll(Arrays.asList(people));  // asList method converted to the list

        for (Person person : studentList) {
            System.out.println(person.name + " , " + person.dateOfBirth);
        }

        studentList.removeIf(each -> each.age < 30);
        System.out.println(studentList);


        // print name & date of birth of each person object

        // remove  all the person object that has the age > 66;






    }
}
