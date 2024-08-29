package Muhtar_SDET.Day34_OOP_AbstractionContinue;

public abstract class Car {// this class can not have object, can not be instantiated(object)

    private final String make,model;
    private String color ;
    private final int year;
    private double price;

    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        this.model = model;
        setColor(color);

        if (year < 1886){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.out.println("Invalid price: " + price);
        }
        this.price = price;
    }

    // default access modifier never accessible outside the package
    protected final void stop(){ // it is used protected because all ** subclasses ** can reach this method
        System.out.println("Press the break to stop " + make + " " + model);
    }

    // it can be used default but out of the package classes can not able to access this method
    protected abstract void start(); // meant to be overridden

    // come from object class
    public String toString() {
        return make +"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= £" + price +
                '}';
    }
}
/*
warmup tasks:
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()
 */