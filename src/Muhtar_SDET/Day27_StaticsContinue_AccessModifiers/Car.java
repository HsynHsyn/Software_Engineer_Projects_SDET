package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class Car {
// only be inner Class can be static other can never be static
    public String make , model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // inner class, inner class has ability to use all outer class members
                            // you have to have outer classes objects

       public void method(){
           System.out.println(make);
           System.out.println(wheels);

       }
    }

    public static class StaticInnerClass{ // *** only accepts outer class static members ***
        public void method(){
            System.out.println(wheels);
            // System.out.println(make); does not accepts because make is instance of Car class
        }

    }
}
