package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class Test_EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeyye",28, 'F', "Java Developer",95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Hakan",5, 'M', "Student",0, "8");

        Employee employee3 = new Employee();
        employee3.setInfo("Halime",37, 'F', "Unemployed",10000, "25");

        System.out.println(employee1+"\n"+employee2 +"\n"+employee3+"\n" );
        employee1.work();



    }
}
