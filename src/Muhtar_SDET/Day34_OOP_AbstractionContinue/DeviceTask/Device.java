package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

public abstract class Device {

    private final String brand, model; // final instance variables have no setter because final variables cannot be changed
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn(); // abstract method

    public abstract void turnOff(); // abstract method


    public String toString() {

        return  getClass().getSimpleName() + "{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}';
    }
}
