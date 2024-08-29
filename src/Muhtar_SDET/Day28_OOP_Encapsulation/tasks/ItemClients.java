package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class ItemClients {
    public static void main(String[] args) {

        Task3_Item item = new Task3_Item("Apple ", 5, 100);

        item.calCost();
        System.out.println(item.calCost());
        System.out.println(item);
    }
}
