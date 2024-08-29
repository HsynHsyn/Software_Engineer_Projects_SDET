package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task1_PizzaClients {
    public static void main(String[] args) {

        Task1_Pizza pizza1 = new Task1_Pizza("Small",10,10);
        Task1_Pizza pizza2 = new Task1_Pizza("Medium",5,7);

        System.out.println(pizza1.calcCost());
        System.out.println(pizza2.calcCost());


    }
}
