package Muhtar_SDET.Day37_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        // • An optional block that can be given after last catch block
        // • Always executed after try & catch blocks whether an exception occurs or not
        // if you want to not execute finally Block, you can use  system.exit(1)

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();

        }finally {
            System.out.println("Finally block");

        }
    }
}
