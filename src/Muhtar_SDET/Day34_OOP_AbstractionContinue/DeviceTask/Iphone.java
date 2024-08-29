package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNum) {
        super(brand, model, price, color, hasBattery, hasPowerButton, phoneNum);
    }


    @Override
    public void downloadApp() {

        System.out.println(getBrand() + " " + getModel() + " is downloading ");

    }

    // to string check
}
