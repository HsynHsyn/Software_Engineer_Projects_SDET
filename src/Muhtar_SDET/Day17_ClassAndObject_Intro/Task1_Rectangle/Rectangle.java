package Muhtar_SDET.Day17_ClassAndObject_Intro.Task1_Rectangle;

public class Rectangle {
    //attributes, fields
    public double width;
    public double length;
    public double area;
    public double perimeter;

    // Setter method to set the width and length
    public void setInfo(double width, double length) { // create instance variable
        // this shows that variables are members of class // variable larin sinifa ait oldugunu gosterir
        this.width = width;     // assigned to instance variables
        this.length = length; // assigned to instance variables
    }

    public double calculateArea(){ // Instance Method
        //double area  = width * length; // if we use area as a normal variable it does not belong to the class objects because declared double new area
        //System.out.println(area);
        area  = width * length; // this area belongs to the class objects
        return area;
    }

    public double calculatePerimeter(){ // Instance Method

        perimeter = 2 * (width + length);
        //System.out.println(perimeter);
        return perimeter;
    }

    public String toString() { // to hold back of printing place of the objects
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +

               '}';
    }
}
/*
Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */