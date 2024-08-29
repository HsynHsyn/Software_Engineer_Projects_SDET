package Muhtar_SDET.Day31_Method_Overriding.vehicleTask;

public class Vehicle {

    /*
    this keyword: reffers to the instances. current class

		this. : calls instance variables & instance methods
		this() : calls the constructor

    super keyword: refers to the instances. parent class

		super. : calls instance variables & instance methods
		super() :  calls the constructor
     */

    private String brand, model, color;
    private int year;
    private double price;

    // constructor is a special method so it can not inherit to the child classes
    public Vehicle(String brand, String model, String color, int year, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()

	2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()

	3. Create a sub class of Vehicle named Bike

			Extra methods:
				ride()

	4. Create a sub class of Vehicle named Boat

			Extra methods:
				sail()

	5. Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()
 */