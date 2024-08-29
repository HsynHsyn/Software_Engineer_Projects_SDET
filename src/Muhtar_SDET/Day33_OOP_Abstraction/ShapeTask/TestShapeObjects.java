package Muhtar_SDET.Day33_OOP_Abstraction.ShapeTask;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square("Square", 5);
        System.out.println(square);
        square.draw();

        System.out.println("------------------------------------------------------");

        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        System.out.println(rectangle);
        rectangle.draw();

        System.out.println("------------------------------------------------------");

        Circle circle = new Circle("Circle", 5);
        System.out.println(circle);


    }
}
