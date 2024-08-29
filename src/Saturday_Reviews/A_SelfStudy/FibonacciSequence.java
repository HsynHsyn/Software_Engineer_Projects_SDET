package Saturday_Reviews.A_SelfStudy;

public class FibonacciSequence {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        for (int i = 0; i < 10; i++) {

            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.println(num3);


        }


    }

}
//0 1 1 2 3 5 8 13 21 34 55 89