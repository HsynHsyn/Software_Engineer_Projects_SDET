package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

public class Exception_ArithmeticException {
    public static void main(String[] args) {

        try{
            int result =  divideNumbers(5,1);
            System.out.println("Result : " + result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    private static int divideNumbers(int dividend, int divisor) {

        if (divisor == 0){
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend/divisor;
    }
}
/*
Java Exception Handling: Exercise-1 with Solution

Write a Java program that throws an exception and catch it using a try-catch block.
 */