package Muhtar_SDET.Day17_ClassAndObject_Intro.Task2_Item;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("computer",1000, 50 );

        Item item2 = new Item();
        item2.setInfo("iphone",99, 50 );


//        double x = item1.calcCost();
//        double y = item2.calcCost();
//        System.out.println(x + y);
        item2.calcCost();
        item1.calcCost();


        System.out.println(item1);
        System.out.println(item2);




    }
}
