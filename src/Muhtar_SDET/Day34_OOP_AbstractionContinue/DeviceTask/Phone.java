package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;


public abstract class Phone extends Device {

    private final long phoneNum;

    public Phone(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNum) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
        this.phoneNum = phoneNum;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    @Override
    public void turnOn() { // overridden abstract method
        System.out.println(getBrand() + " " + getModel() + " is turning on");

    }

    @Override
    public void turnOff() {// overridden abstract method
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

    public void call(long phoneNum){
        System.out.println(  getBrand() + " " + getModel() + " " + phoneNum +" is calling");
        System.out.println("Calling " + phoneNum + "...");
    }

    public void text(long phoneNum){
        System.out.println( getBrand() + " " + getModel() + " " + phoneNum +" is texting");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                ", getPhoneNum=" + getPhoneNum() +
                '}';

    }
}
