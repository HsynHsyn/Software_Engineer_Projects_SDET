package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

public class PersonalComputer extends Computer implements Downloadable{


    public PersonalComputer(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, short storage, short memory) {
        super(brand, model, price, color, hasBattery, hasPowerButton, storage, memory);
    }


    @Override
    public void downloadApp() {

    }

    //static method hiding everything is same
    public static void test() {
    }


    }
