package Preparing.Day26_Arrays_Cont;

import java.util.Scanner;

public class MethodArray2 {
    public static void main(String[] args) {

        System.out.println(findCar(2,"ali"));

    }
    public static String[] creatArray (int arraySize) {
        Scanner input = new Scanner(System.in);

        String[] cars = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter cars name");
            cars[i] = input.next();

        }

        return cars;
    }
    
    public static boolean findCar(int value, String toFindCar) {
        for (String car : creatArray(value)) {
            if (car.equalsIgnoreCase(toFindCar)){
                return true;
            }
            
        }

        return false;
    }

}

// creatArray will accept one parameter which is arraySize
// user will enter some cars

// findCar method - will accept 2 parameters which 1-int value, toFindCar
// if car is found - return true
// if not return false