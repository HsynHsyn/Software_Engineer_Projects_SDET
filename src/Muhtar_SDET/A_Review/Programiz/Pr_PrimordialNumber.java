package Muhtar_SDET.A_Review.CodingBat;

public class Pr_PrimordialNumber {
    public static void main(String[] args) {

        System.out.println(calculatePrimorial(4));

    }

    public static boolean isPrime(int num) {
        boolean prime = true;
        if(num == 1)
            prime = false;
        for(int i = 2; i < num; i++){
            if(num % i == 0)
                prime = false;
        }
        return prime;
    }

    public static int calculatePrimorial(int n) {
        int primorial = 1, numPrimes = 0;
        int limit = (int) Math.pow(n, 3); // this is the border, it is chosen ( n, 3) as a cube

        if(n == 1)
            primorial = 2; // the first prime number

        for(int i = 2; i < limit; i++){
            if(isPrime(i)){
                primorial *= i;
                numPrimes++;
            }
            if(numPrimes == n)
                break;
        }

        return primorial;
    }
}


