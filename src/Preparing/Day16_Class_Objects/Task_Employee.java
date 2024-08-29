package Preparing.Day16_Class_Objects;

public class Task_Employee {
    String name ;
    String jobTitle;
    double salary;

    public double work() {

        return salary;
    }

    public String attendMeeting() {

        return "%100";
    }

    public String introduce() {

        return name;
    }


    public static void main(String[] args){

        Task_Employee my_employee=new Task_Employee();
        my_employee.name="Hakan";
        my_employee.jobTitle="Tester";
        my_employee.salary=2500;

        my_employee.work();
        my_employee.attendMeeting();
        my_employee.introduce();

        System.out.println("My employee name is = " + my_employee.introduce());
        System.out.println("My employee meeting attendance is = " + my_employee.attendMeeting());
        System.out.println("My employee salary is = " + my_employee.work());




    }
}
