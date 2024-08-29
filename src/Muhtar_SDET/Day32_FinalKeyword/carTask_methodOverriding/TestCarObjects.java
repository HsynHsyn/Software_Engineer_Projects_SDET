package Muhtar_SDET.Day32_FinalKeyword.carTask_methodOverriding;

import Muhtar_SDET.Day31_Method_Overriding.PersonTask.Tester;

public class TestCarObjects {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2020, 250000);
        Honda honda = new Honda("Accord", "Gray", 2019, 40000);
        Audi audi = new Audi("Q6", "Silver", 2024, 70000);
        BMW bmw = new BMW("X6", "Black", 2022, 60000);
        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("------------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("------------------------------------------------");

        // tesla.setPrice(30000); // gives error
        tesla.setModel("Model H");  // gives error


    }
}
