package Preparing.Day13_Methods;

public class RecursiveMethodExample3 {

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
        int number=7; // finding 5. number of fibonacci
        int result= fibonacci(number);
        System.out.println("Fibonacci (" + number +")= " + result);

    }
}
