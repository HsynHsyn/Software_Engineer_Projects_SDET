package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

public abstract class Computer extends Device{

    private final short storage,memory;

    public Computer(String brand, String model, double price, String color, boolean hasBattery, boolean hasPowerButton, short storage, short memory) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
        this.storage = storage;
        this.memory = memory;
    }


    public short getStorage() {
        return storage;
    }

    public short getMemory() {
        return memory;
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turning on");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

//    @Override // not necessary
//    public String toString() {
//        return super.toString();
//    }

    public void checkStorage() {
        System.out.println("The computer has " + getStorage() + "GB of storage available.");
    }


    public void checkMemory() {
        System.out.println("The computer has " + getMemory() + "GB of RAM.");
    }


}
