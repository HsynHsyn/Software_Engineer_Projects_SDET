package Muhtar_SDET.Day19_ArraysIntro;

import java.util.Scanner;

public class Task5_Items {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] items = new String[5];

        double[] prices = new double[5];

        double totalPrice = 0;
        String itemNamesAndPrices = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your " + (i+1) + ". item`s name: ");
            items[i] = input.next();

            System.out.println("Enter your " + (i+1) + ". item`s price: ");
            prices[i] = input.nextInt();

            totalPrice += prices[i];

            itemNamesAndPrices += "Item name is " + items[i] +  "\nitem price is " +  prices[i] + "\n" + "\n" ;

        }

        System.out.println(itemNamesAndPrices + "\n" + "total Price " + totalPrice);
    }
}

/*
Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
