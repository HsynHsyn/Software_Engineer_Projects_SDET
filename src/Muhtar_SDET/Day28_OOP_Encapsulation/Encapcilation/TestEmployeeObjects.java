package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        /*Employee employee1 = new Employee();
        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

        employee1.setName("     ");
        System.out.println(employee1.getName());*/

        Employee employee1 = new Employee("hakan",100000,"Java Developer",30 );
        Employee employee2 = new Employee("hakan",100000,"Java Developer",30 );
        Employee employee3 = new Employee("hakan",100000,"Java Developer",30 );

        employee1.test= 1000;
        System.out.println(employee1.test);
        System.out.println(employee2.test);
        System.out.println(employee3.test);


        //System.out.println(employee1);

    }
}
