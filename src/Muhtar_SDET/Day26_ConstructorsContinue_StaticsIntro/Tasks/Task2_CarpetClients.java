package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task2_CarpetClients {
    public static void main(String[] args) {

        Task2_Carpet carpet1 = new Task2_Carpet(3,2,1000,true);
        System.out.println(carpet1);

        System.out.println(carpet1.calcCost());

        Task2_Carpet carpet2 = new Task2_Carpet(1,2,500,false);
        System.out.println(carpet2);

        System.out.println(carpet2.calcCost());

    }
}
