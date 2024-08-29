package Muhtar_SDET.Day34_OOP_AbstractionContinue;

public class TestCarObjects {
    public static void main(String[] args) {

        //Car car = new Car("x6", "Red", 2000,250000);
        Honda honda = new Honda("Pilot", "Black",2019,35000);
        Audi audi = new Audi("Q6", "White",2020,45000);
        Tesla tesla = new Tesla("Model Y", "Grey",2022,60000);
        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        System.out.println("------------------------------------------------------------");
        honda.stop();
        tesla.stop();
        audi.stop();

        System.out.println("------------------------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

    }
}
