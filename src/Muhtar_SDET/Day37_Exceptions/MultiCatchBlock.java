package Muhtar_SDET.Day37_Exceptions;

import Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program1 started");
        Car car  = null;

        try{
            car.drive();                // just one block catch block will be executed

        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();

        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();

        } catch (NullPointerException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();

        }catch (RuntimeException e){ // Parent exception class can not be placed before child exception class
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }
        System.out.println("Program1 ended");

    }
}
