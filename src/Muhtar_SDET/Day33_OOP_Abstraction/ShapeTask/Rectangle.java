package Muhtar_SDET.Day33_OOP_Abstraction.ShapeTask;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle: ");
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");

    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", width=" + width +
                ", length=" + length +
                "} ";
    }
}
