package Muhtar_SDET.Day33_OOP_Abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        // Employee employee = new Employee(); // Employee class is an abstract class so can not create an object
                                                // we can not create objects from an abstract class
                                               //  Object MUST be created from a concrete class
        Teacher teacher = new Teacher("james", 45,'M', "T01", "Math Teacher", 75000);
        Developer developer = new Developer("Hakan", 15,'M', "D01", "Developer", 80000, "Java");
        Driver driver = new Driver("Huseyin", 35,'M', "D01", "Truck Driver", 50000);

       // PolyMorphism Employee teacher5 = new Teacher("james", 45,'M', "T01", "Math Teacher", 75000);
        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);

        System.out.println("=================================================");

        teacher.work();
        driver.work();
        developer.work();


    }
}
