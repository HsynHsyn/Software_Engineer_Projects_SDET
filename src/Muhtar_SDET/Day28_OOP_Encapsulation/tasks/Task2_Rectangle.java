package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class Task2_Rectangle {

    private double width;
    private double length;

    public Task2_Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);

    }

    public double getWidth() {
       /* if (width > 100){
            System.err.println("----------");
            System.exit(1);

        } */
        return width;
    }

    public void setWidth(double width) {
        if ( width < 0 || width == 0){
            System.err.println("The width and length cannot be negative or zero values");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if ( length < 0 || length == 0){
            System.err.println("The width and length cannot be negative or zero values");
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){
        double area = width * length;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */