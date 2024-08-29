package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class CandyClients {
    public static void main(String[] args) {

        Task4_Candy candy = new Task4_Candy("Ferrero",12,true,0);

        candy.setPrice(100);
        System.out.println(candy.getPrice());
        System.out.println(candy);
    }
}
