package Muhtar_SDET.Day38_Exception_Handlings.shapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius <= 0){
            throw new InvalidShapeException("Radius of the circle can not be negative or zero" + radius);
        }
        this.radius = radius;
    }
}
