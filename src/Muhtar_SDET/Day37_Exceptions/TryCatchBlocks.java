package Muhtar_SDET.Day37_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");

        // if try can handle situation it can , or catch block must handle
        try{

            System.out.println(9/0); // Arithmetic Exception
            System.out.println("Try Block");

        }catch (ArithmeticException e){ // line 10 and line 13 must be inheritance (is A relationship)
            System.out.println("Catch Block");

        }

        System.out.println("Program ended");

        System.out.println("---------------------------------------------------------");

        System.out.println("Program2 started");
        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        // if we do not know exception type we can use RunTimeException because RunTimeException is unchecked exception
        }catch (NullPointerException e){ // can use RunTimeException
            System.out.println("Catch Block");
        }

        System.out.println("Program2 ended");

        System.out.println("---------------------------------------------------------");

        System.out.println("Program3 started");



        try{
            Thread.sleep(3000);  // Checked exception
            System.out.println("Try Block");

        }catch (InterruptedException e){
            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");

    }
}
