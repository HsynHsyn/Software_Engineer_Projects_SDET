package Muhtar_SDET.Day31_Method_Overriding.vehicleTask;

public class Boat extends Vehicle{
    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail(){
        System.out.println( getBrand() + " " + getBrand() + " is sailing");
    }
}
