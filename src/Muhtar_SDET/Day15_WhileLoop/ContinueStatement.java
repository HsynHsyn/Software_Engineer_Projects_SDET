package Muhtar_SDET.Day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("---------------------------------");

        for (int i = 10; i < 21 ; i++) {

            if (i % 2 == 0){ // if i is even skips  the current iteration
                continue;
            }

            System.out.println(i);

        }
        System.out.println("---------------------------------");

        for (char i = 'A'; i < 'G' ; i++) {

//            if (i == 'B')
//                continue;

//            if (i == 'E')
//                continue;

            if (i == 'B' || i == 'E') // logical or operator
                continue;

            System.out.println(i);

        }
        System.out.println("---------------------------------");

        for (int i = 0; i < 10; i++) { // in just one statement we can use without {} but it is not good practice
            System.out.println("Hello world");
        }
        System.out.println("---------------------------------");
        // find the sum of all the even number between 50¬100

    }



}
