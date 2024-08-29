package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle (double radius){
        this.radius = radius;
        diameter = radius * 2; // diameter cap
    }

    /*public static double calcArea(){
       //return radius * radius * pi; // static method can not achieve instance variables
                                        // static only accepts static variables
    }*///static method

    // Classes can not share object members
    // objects can share Class members
    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

    // if you do not need to use instance variable methods must be static
    public static void printPiValue(){ // you can just use once
        System.out.println("PI` value is : " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea() + // if calcArea() is void we can not use like this because it will not return anything
                ", perimeter =" + calcPerimeter() +
                '}';
    }
}
/*
Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi,
			area and perimeter of the circle when the object of circle is passed
			in the print statement
 */