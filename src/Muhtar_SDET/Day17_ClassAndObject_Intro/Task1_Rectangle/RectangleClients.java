package Muhtar_SDET.Day17_ClassAndObject_Intro.Task1_Rectangle;


public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();// creating object from Rectangle class
        rectangle1.setInfo(5,15); // creating setInfo

        System.out.println(rectangle1.calculateArea());// returning area
        System.out.println(rectangle1.calculatePerimeter()); // returning  perimeter

        //rectangle1.calculateArea();
        //rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

    }
}
