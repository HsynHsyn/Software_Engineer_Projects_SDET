package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro;

public class Iphone {

    public static String brand = "Apple"; // it is used as static public// Apple is the all iphone objects brand
    public String model; // instance: different models for iphone objects
    public String color;
    public double price;
    public static String OS = "IOS"; // static : operating system is same all the iphone objects
    public static String madeIn = "China";
    public static  boolean hasBattery = true;
    public static  boolean isTouchScreen = true;
    public static  boolean isExpensiveToFix = true;

    public Iphone(String model, double price, String color) { // they need to initialize, every object create
        this.model = model;
        this.price = price;
        this.color = color;
    }
/* public static void printPhoneInfo(){ // static only accepts static and class members, does not accepts instance members
        System.out.println("Model : " + model);
        System.out.println("Model : " + color);
    }*/

    public void printPhoneInfo(){ // instance method can use static and instance members
        System.out.println("Brand: " + brand );
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){ // if the method does not need to depend on the object then it is better make a static
        System.out.println("Operating System: " + OS);
    }








}
/*
brand, model, color, price, madeIn, hasBattery, isTouchScreen
 */