package Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }


    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
