package Muhtar_SDET.Day34_OOP_AbstractionContinue;

public class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start "+ getMake() + " " + getModel());

    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto feature");
    }
}
