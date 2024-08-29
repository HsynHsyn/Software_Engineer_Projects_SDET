package Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask;

public class Iphone extends Phone {

    // there is no need to add String brand in to constructor , due to every brand is same it is put to super "Apple"
    /*public Iphone( String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }*/
    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);

    }

    public void faceTime(String email){

        System.out.println(getModel() + " is face timing with " + email);
    }
}
