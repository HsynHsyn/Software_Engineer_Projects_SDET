package Muhtar_SDET.Day31_Method_Overriding.shape_methodOverridding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
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
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
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

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
