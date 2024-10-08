package Muhtar_SDET.Day36_OOP_Polymorphism_Continue;



import Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask.*;


public class PolymorphismPractice {
    public static void main(String[] args) {

        //reference type - object type
        Phone phone = new Iphone("Iphone 11 Pro", "Large", "Black", 900);

        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Smalle", "Gold", 400),
                new Iphone("Iphone 7", "Smalle", "White", 500)
        };

        // 1. print the model, color and price of each phone object in the following format
        // model - color - price

        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("---------------------------------------------------");
        // 2. How many Iphones in the array of phones?

        int countIphone = 0;
        int countSamsung = 0;

        for (Phone each : phones) {
            if (each instanceof Iphone){
                countIphone++;
            }
        }

        for (Phone each : phones) {
            if (each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("---------------------------------------------------");

       // 4. Display the models of Iphones and samsung that has the price of 700 or greater
        for (Phone each : phones) {
            if (each instanceof Phone || each instanceof Samsung){
                if (each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }

        }

    }
}

/*
        1. print the model, color and price of each phone object in the following format
        model - color - price

        2. How many Iphones in the array of phones?

        3. How many Samsungs in the array of phones?

        4. Display the models of Iphones and samsung that has the price of 700 or greater
 */