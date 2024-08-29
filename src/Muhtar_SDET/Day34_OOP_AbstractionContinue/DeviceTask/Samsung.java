package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps{

    public Samsung(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNum) {
        super(brand, model, price, color, hasBattery, hasPowerButton, phoneNum);
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading");
    }


    // to string check
}
