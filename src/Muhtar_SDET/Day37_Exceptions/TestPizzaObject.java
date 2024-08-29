package Muhtar_SDET.Day37_Exceptions;

import Muhtar_SDET.Day36_OOP_Polymorphism_Continue.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        // equals() default is false

        Pizza pizza1 = new Pizza('S', 2, 3);
        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2); // false

        // System.out.println(pizza1.equals("pizza"));// gives error
        // System.out.println(pizza1.equals(1000)); // gives error

        System.out.println(pizza1.equals(pizza2)); // it looks inside of two object

        Object obj = new Pizza('S', 2, 3); // casting implicitly
        Pizza obj1 = (Pizza) obj;
        // obj.calcCost(); gives an error because Object has not calcCost()

        boolean r = obj.equals(pizza2); // true
        System.out.println(r);

        double total =  ((Pizza) obj).calcCost();
        System.out.println(total);

        //double area  =  ((Circle)obj).area();
        //System.out.println(area); // gives ClassCastException

        System.out.println("test completed");



    }
}
