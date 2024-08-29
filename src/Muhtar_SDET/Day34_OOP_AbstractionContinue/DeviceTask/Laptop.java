package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;


public class Laptop extends PersonalComputer {


    public Laptop(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, short storage, short memory) {
        super(brand, model, price, color, hasBattery, hasPowerButton, storage, memory);
    }
    //static method hiding everything is same
    public static void test(){
        System.out.println();
    }
}
