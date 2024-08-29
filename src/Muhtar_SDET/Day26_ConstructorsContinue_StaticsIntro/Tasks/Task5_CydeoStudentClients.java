package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task5_CydeoStudentClients {
    public static void main(String[] args) {

        Task5_CydeoStudent student1 = new Task5_CydeoStudent("Hakan",5, 15,36,01,'M', 'A');

        System.out.println(student1.toString());
        System.out.println(student1.schoolName);

        System.out.println(student1.programmingLanguage());
    }
}
