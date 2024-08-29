package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

public class Exception_OddNumber {
    public static void main(String[] args) {

       try{
           boolean result = checkOddNumber(4);
           System.out.println("Number is even");
       }catch (IllegalArgumentException e){
           e.printStackTrace();
           System.out.println("----------------------");
           e.getMessage();
       }

    }

    private static boolean checkOddNumber(int number) {

        if( !(number > 0 && number % 2 == 0)  ){
            throw new IllegalArgumentException("Number must be an even number");
        }
        return true;
    }
}
/*
Java Exception Handling: Exercise-2 with Solution

Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
 */