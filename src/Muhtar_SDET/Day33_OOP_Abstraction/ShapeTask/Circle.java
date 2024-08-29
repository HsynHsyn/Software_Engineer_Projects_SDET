package Muhtar_SDET.Day33_OOP_Abstraction.ShapeTask;

import Muhtar_SDET.Day19_ArraysIntro.DecimalFormatt;

import java.text.DecimalFormat;

public class Circle extends Shape{

    static double PI = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (radius * radius) * 2;
    }

    @Override
    public double perimeter() {
        return (PI * 2 * radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: ");
        System.out.println("\t  * * *");
        System.out.println("\t*       *");
        System.out.println("\t*       *");
        System.out.println("\t*       *");
        System.out.println("\t  * * *");

    }

    @Override
    public String toString() {

        return "Circle{" +
                "radius=" + radius +
                 super.toString().replace("}", "");
    }
}
