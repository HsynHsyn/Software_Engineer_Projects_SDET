package Saturday_Reviews.week14.Discord;

import java.time.LocalDate;

public class TestUsers {
    public static void main(String[] args) {

        Admin admin = new Admin("Admin", "James", "james7", LocalDate.now());
        System.out.println(admin);
        admin.createChannel("Hakan Channel");
        admin.joinDiscord("Batch 36");

        System.out.println("---------------------------------------");

        Student student = new Student("Student", " HAKAN", "A001", LocalDate.of(2000,01,01));
        System.out.println(student);
        student.joinDiscord("Cydeo B36");
        student.sendMessage();
        student.sendMessage("Halime");


    }
}
