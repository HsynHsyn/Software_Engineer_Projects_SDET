package Muhtar_SDET.Day36_OOP_Polymorphism_Continue;

public class TestEqualMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false
        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1.equals(circle3)); // false

        System.out.println("------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);
        IPhone iphone2 = new IPhone("Apple", "Iphone 13", "Large", "White", 1000);

        // System.out.println(iphone1.equals(circle1)); // gives error
        System.out.println(iphone1.equals(iphone2));




    }
}
