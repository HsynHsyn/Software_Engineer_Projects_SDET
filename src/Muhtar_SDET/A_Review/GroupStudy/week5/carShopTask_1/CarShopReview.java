package Muhtar_SDET.A_Review.GroupStudy.week5.carShopTask_1;

import Muhtar_SDET.Day34_OOP_AbstractionContinue.Audi;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Car;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Honda;
import Muhtar_SDET.Day34_OOP_AbstractionContinue.Tesla;

import java.util.ArrayList;
import java.util.Arrays;


public class CarShopReview {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "White", 2003, 25000),
                new Audi("Q6", "Red", 2017, 35000),
                new Honda("Accord", "White", 2012, 33000),
                new Audi("Q4", "Blue", 2009, 19000),
                new Audi("A7", "Black", 2016, 18000),
                new Audi("Q8", "White", 2022, 45000),
                new Audi("Q5", "Purple", 2023, 55000),
                new Audi("A4", "Black", 2024, 65000),
                new Honda("Civic", "Red", 2016, 55000),
                new Honda("CR-V", "Red", 2000, 48000),
                new Honda("HR-V", "Blue", 1998, 24000),
                new Tesla("Model 3", "White", 2001, 20000),
                new Tesla("Model Y", "Black", 2004, 30000),
                new Tesla("Model X", "White", 2015, 45000),
                new Tesla("Model X", "Blue", 2017, 69000)
        };

        //1.2. Display all cars eligible for recall:- Honda: Years 2010 to 2019 /- Audi: Years 2015 to 2019 // -Tesla: Years 2015 to 2023
        //first solution

        for (Car each : cars) {
            if (each instanceof Honda) {
                if (each.getYear() >= 2010 && each.getYear() <= 2019) {
                    System.out.println(each);

                }
            }

        }

        System.out.println("----------------Audi----------------------");
        for (Car each : cars) {
            if (each instanceof Audi) {
                if (each.getYear() >= 2015 && each.getYear() <= 2019) {
                    System.out.println(each);
                }
            }
        }

        System.out.println("------------------Tesla-----------------------------");
        for (Car each : cars) {
            if (each instanceof Tesla) {
                if (each.getYear() >= 2015 && each.getYear() <= 2023) {
                    System.out.println(each);
                }
            }
        }
        System.out.println("-----------------muradil--------------------------------");
        for (Car car : cars) {
            int year = car.getYear();
            boolean forHonda = car instanceof Honda && year >= 2010 && year <= 2019;
            boolean forAudi = car instanceof Audi && year >= 2015 && year <= 2019;
            boolean forTesla = car instanceof Tesla && year >= 2015 && year <= 2023;
            if (forHonda || forAudi || forTesla) {
                System.out.println(car);
            }
        }

        //1.3. Display the car with the highest price.
        //1.4. Display the car with the lowest price.

        ArrayList<Car> carArrayList1 = new ArrayList<>(Arrays.asList(cars));
        double highestPrice1 = carArrayList1.get(0).getPrice();
        double lowestPrice1 = carArrayList1.get(0).getPrice();

        for (Car each : carArrayList1) {

            if (each.getPrice() > highestPrice1) {
                highestPrice1 = each.getPrice();
            }

            if (each.getPrice() < lowestPrice1) {
                lowestPrice1 = each.getPrice();
            }

        }

        System.out.println("--------------------------------------------------------------");

        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(cars));

        double highestPrice = carArrayList.get(1).getPrice();
        double lowestPrice = carArrayList.get(3).getPrice();


        for (Car each : carArrayList) {

            if (each.getPrice() > highestPrice) {
                highestPrice = each.getPrice();
            }

            if (each.getPrice() < lowestPrice) {
                lowestPrice = each.getPrice();
            }

        }
        System.out.println("---------------------lowest/highest----------------------------------");

        for (Car each : carArrayList) {

            if (highestPrice == each.getPrice()) {
                System.out.println("Highest Priced Car: " + each);
            }

            if (lowestPrice == each.getPrice()) {
                System.out.println("Lowest Priced Car: " + each);
            }

        }

        //  1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.
        System.out.println("------------------teslaCars-----------------------------");

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car each : cars) {
            if (each instanceof Tesla) { // each belongs to Car class
                teslaCars.add((Tesla) each); // (Tesla) each belong to Tesla class
            }
        }
        System.out.println(teslaCars);

        System.out.println("==============================================================");
    }



}