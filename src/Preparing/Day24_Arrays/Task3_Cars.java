package Preparing.Day24_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task3_Cars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rn = new Random();

        String[] carBrands = {"Honda","Toyota", "Nissan","BMW","Mercedes", "Porsche","Ferrari"};

        System.out.println("Please enter the your dream car's index: ");
        int carIndex = input.nextInt();

        if (carBrands[carIndex] =="Honda" || carBrands[carIndex] =="Toyota" || carBrands[carIndex] == "Nissan" ) {
            System.out.println(rn.nextInt((40000-20000)+1) + 20000);
        } else if (carBrands[carIndex] =="BMW" || carBrands[carIndex] =="Mercedes" ) {
            System.out.println(rn.nextInt((80000-30000) +1 ) + 30000);
        } else if (carBrands[carIndex] == "Porsche"  || carBrands[carIndex] == "Ferrari"  ) {
            System.out.println(rn.nextInt((150000-100000)+1) + 100000);
        }else {
            System.out.println("Please check your number");
        }

    }

}
/*
• Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
Ferrari)
• Ask user to enter an index number to choose his dream car.
• Print the price for selected car.
Car prices :
Honda – Toyota – Nissan (Random price between 20000 and 40000)
BMW-Mercedes(Random price between 50000 and 80000)
Porsche - Ferrari(Random price between 100000 and 150000)
• Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
 */