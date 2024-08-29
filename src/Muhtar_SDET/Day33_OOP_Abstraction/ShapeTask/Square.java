package Muhtar_SDET.Day33_OOP_Abstraction.ShapeTask;

public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public double perimeter() {
        return getSide() *4 ;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square: ");
        System.out.println("\t* * * * *");
        for (int i = 0; i < 2; i++) {
            System.out.println("\t*       *");

        }
        System.out.println("\t* * * * *");
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
