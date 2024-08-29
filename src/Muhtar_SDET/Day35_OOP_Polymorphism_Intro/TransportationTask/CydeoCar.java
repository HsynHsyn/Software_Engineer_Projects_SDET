package Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask;

import Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask.Flyable;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
