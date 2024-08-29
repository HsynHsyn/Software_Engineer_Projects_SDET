package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Exception_DuplicateNumberCheck {
    public static void main(String[] args) {

        try{
            ArrayList<Integer> numbers = readNumbersFromUser();
            checkDuplicates(numbers);

            System.out.println("it is not duplicate");
        } catch (RuntimeException | Duplicate_Number_Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> readNumbersFromUser() {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Input the integers:");
            int num = scanner.nextInt();
            numbers1.add(num);
        }
        scanner.close();
        return numbers1;
    }

    public static void checkDuplicates(ArrayList<Integer> numbers) throws Duplicate_Number_Exception {

        ArrayList<Integer> uniqueNumber = new ArrayList<>();

        for (Integer each : numbers) {
            if (uniqueNumber.contains(each)){
                throw new Duplicate_Number_Exception ("Duplicate number found: " + each);
            }else {
                uniqueNumber.add(each);
            }

        }

    }
    ///

}

class Duplicate_Number_Exception extends Exception { // by inheriting from Exception class
    public Duplicate_Number_Exception(String message){
        super(message);
    }
}

/*
Java Exception Handling

Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
 */