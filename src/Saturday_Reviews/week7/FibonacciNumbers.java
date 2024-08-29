package Saturday_Reviews.week7;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        int number = 15;

       //System.out.print(num1 + " ");

        while (num2 < number) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
    }
}

///0 1 1 2 3 5 8 13 21 34 55 89

/*
public static int fibonacci(int n) {
        // basic states F(0)=0 and F(1)=1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //recursive state: F(n)=F(n-1) + F(n-2)
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){
        int number=7; // finding 7. number of fibonacci
        int result= fibonacci(number);
        System.out.println("Fibonacci (" + number +")= " + result);

    }
 */