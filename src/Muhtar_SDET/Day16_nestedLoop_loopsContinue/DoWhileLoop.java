package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition = false;
        for (; condition; ) {
            System.out.println("Hello Cydeo");

        }
        System.out.println("-------------------------------");
        while (condition){
            System.out.println("Hello Cydeo");
        }
        System.out.println("-------------------------------");
        do {
            System.out.println("Hello Cydeo-------Do&While Loop");
        }while (condition);
    }
}
