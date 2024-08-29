package Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask;

import Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane " + getMake() + " " + getModel() + " is landing");
    }

    @Override
    public void fly() { // it belongs abstract class Plane
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
