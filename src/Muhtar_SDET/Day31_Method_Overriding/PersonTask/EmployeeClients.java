package Muhtar_SDET.Day31_Method_Overriding.PersonTask;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Hakan", 5, "E01", "Software Tester", "Amazon", 55000);
        Developer developer = new Developer("Huseyin", 38, "E02", "Frontend Dev", "Google", 60000, "java");
        Teacher teacher = new Teacher("Halime", 37, "E03", "Turkish Teacher", "St Thomas", 50000);
        Driver driver = new Driver("Mehmet", 30, "E04", "Bus Driver", "Manchester Council", 49000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println("-----------------------------------------------");

        tester.work();
        developer.work();
        teacher.work();
        driver.work();

        System.out.println("-----------------------------------------------");

        tester.eat();
        developer.sleep();

        System.out.println("-----------------------------------------------");

        teacher.setSalary(99999);
        System.out.println(teacher.getName());
        System.out.println(teacher);




    }
}