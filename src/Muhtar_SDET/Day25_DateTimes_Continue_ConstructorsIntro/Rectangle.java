package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

public class Rectangle {

    public double length, width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /*public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }*/ //setInfo();

    public double area(){
        return length * width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
