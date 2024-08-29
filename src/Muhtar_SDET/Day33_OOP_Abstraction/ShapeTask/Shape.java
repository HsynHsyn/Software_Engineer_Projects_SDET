package Muhtar_SDET.Day33_OOP_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getClass().getSimpleName() + "{" +
                "area='" + area() + '\'' +
                ", perimeter='" + df.format(perimeter()) + '\'' +
                '}';
    }
}
