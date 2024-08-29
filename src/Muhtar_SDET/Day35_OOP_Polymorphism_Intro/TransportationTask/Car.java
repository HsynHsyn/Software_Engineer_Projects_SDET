package Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask;

public abstract class Car extends Transportation {
    // with abstract Car class ignore the transportPeople() and start() abstract method
    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getMake() + " " + getModel());
    }


}
