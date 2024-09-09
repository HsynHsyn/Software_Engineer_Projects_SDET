package Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand, model, size;
    private String color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price) { // it is not used setInfo() because Constructor is always the best choose when it comes to initialize the instances
       /* this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price; */ // fields

        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
   }

    public String getBrand(){
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1); // status code 1
        }
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public static void test(){ // can use static method in super class
        System.out.println("test");
    }

    public void setColor(String color) {
        // List<String> list = Arrays.asList(array);
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red","Green","Gray"};

        if (Arrays.asList(colors).contains(color) ){
            this.color = color;
        }else {
            System.err.println("Invalid price: " + color + "\n color of the can only be : "  + Arrays.asList(colors)  );
            System.exit(1); // status code 1
        }
    }

    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber );

    }

    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting to " + phoneNumber );

    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
Why Use a Constructor Instead of setInfo() in Java Inheritance?

Initialization at Object Creation
Constructor: A constructor is automatically called when an instance of a class is created,
ensuring that the object is fully initialized from the moment it's instantiated.
This means the object is in a valid and complete state immediately.

setInfo() Method: This method must be called after the object has been created.
 This could result in the object being in an incomplete or invalid state until the setInfo() method is called.
 */

/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */