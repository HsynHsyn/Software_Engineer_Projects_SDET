package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class TestCydeostudentObject {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName); // calling with Classname

        CydeoStudent student1 = new CydeoStudent("Hakan",22,'M');
        CydeoStudent student2 = new CydeoStudent("Halime",35,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);




    }
}
