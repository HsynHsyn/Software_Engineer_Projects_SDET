package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class Task1_Circle {

    private double radius;
    private static double PI = 3.14;

    public Task1_Circle(double radius) {
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0 || radius == 0){
            System.err.println("The radius cannot be set to a negative or zero value");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
       double area = PI * radius * radius;
       return area;
    }

    public double calcPerimeter(){
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    public String toString() {
        return "Task1_Circle {" +
                " radius=" + radius +
                " radius=" + calcArea() +
                " radius=" + calcPerimeter() +
                '}';
    }
}
/*
Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.
 */