package Saturday_Reviews.week15.unchecked;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter 2 numbers: ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println(num1 / num2);

        }catch (ArithmeticException | InputMismatchException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");

        }

        input.close();
        System.out.println("DONE");
    }
}
