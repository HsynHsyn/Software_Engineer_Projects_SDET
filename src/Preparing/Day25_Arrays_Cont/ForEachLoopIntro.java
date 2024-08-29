package Preparing.Day25_Arrays_Cont;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        String[] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
        double[] prices = {120.0, 10.3, 30.0, 45.0, 50.6, 99.9};

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        System.out.println("-------------------------------------");
        // same output and same order
        for (String prod : products) {
            System.out.println(prod);
        }
        // print prices
        System.out.println("-------------------------------------");
        for (double pr : prices){
            System.out.println(pr);
        }
        // print product in reverse order
        System.out.println("-------------------------------------");
        for (int i = products.length; i >= 0 ; i--) {
            System.out.println(products[i]);
        }



    }
}
