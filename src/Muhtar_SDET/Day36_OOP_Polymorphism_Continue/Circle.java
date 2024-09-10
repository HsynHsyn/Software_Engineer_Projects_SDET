package Muhtar_SDET.Day36_OOP_Polymorphism_Continue;

public class Circle {

    private double radius;

    public final static  double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (radius * radius) * 2;
    }


    public double perimeter() {
        return (PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    // .equals(); we have just one equals method ve can override
    @Override
    public boolean equals(Object obj) { // obj reference any objects
        if (!(obj instanceof Circle)){ // if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if (radius == ( (Circle)obj ).radius){ // if the current circle`s radius is equal to the given circle`s radius , then two circles equal
            return true;

        }
        return false;
    }
}
