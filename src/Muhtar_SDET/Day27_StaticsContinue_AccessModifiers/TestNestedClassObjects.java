package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {

        Car obj1 = new Car();// Car object
        Car.CarEngine  obj2= obj1.new CarEngine(); // creating CarEngine object
                                // *** without the obj1 can not create CarEngine object ***
        //Car.CarEngine x = obj1.new CarEngine();
        //Car.CarEngine myCarEngine = obj1.new CarEngine();  // creating CaeEngine objects


       Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); // just calls outer class name
    }
}
