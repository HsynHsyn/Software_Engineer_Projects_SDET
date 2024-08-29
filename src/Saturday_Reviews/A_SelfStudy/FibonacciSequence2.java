package Saturday_Reviews.A_SelfStudy;

public class FibonacciSequence2 {
    public static void main(String[] args) {

        int number=7; // finding 7. number of fibonacci
        int result= fibonacci(number);
        System.out.println("Fibonacci (" + number +")= " + result);


    }
    public static int fibonacci(int number){ // the number represents which fibonacci sequence number


        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }

        //recursive state: F(n)=F(n-1) + F(n-2)
        return fibonacci(number -1) + fibonacci(number-2);
    }
}

/*

fibonacci(2) = 1 + 0 = 1
fibonacci(3) = 1 + 1 = 2
fibonacci(4) = 2 + 1 = 3
fibonacci(5) = 3 + 2 = 5
fibonacci(6) = 5 + 3 = 8
fibonacci(7) = 8 + 5 = 13
fibonacci(8) = 13 + 8 = 21
fibonacci(9) = 21 + 13 = 34
------------------------------------
Hesaplama Adımları
fibonacci(9) çağrısı, özyinelemeli olarak diğer fibonacci çağrılarını tetikler:



fibonacci(9) = fibonacci(8) + fibonacci(7)


fibonacci(8) = fibonacci(7) + fibonacci(6)


fibonacci(7) = fibonacci(6) + fibonacci(5)


fibonacci(6) = fibonacci(5) + fibonacci(4)


fibonacci(5) = fibonacci(4) + fibonacci(3)


fibonacci(4) = fibonacci(3) + fibonacci(2)


fibonacci(3) = fibonacci(2) + fibonacci(1)


fibonacci(2) = fibonacci(1) + fibonacci(0)

fibonacci(1) = 1
fibonacci(0) = 0 buradan toplayarak yukari dogru gidiyor recursive

*/