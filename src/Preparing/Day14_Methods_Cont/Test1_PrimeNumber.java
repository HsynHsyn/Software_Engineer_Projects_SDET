package Day_14_Methods_Cont;

public class Test1_PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 ve 1 asal sayı değildir.
        }
        if (number == 2) {
            return true; // 2 tek çift asal sayıdır.
        }
        if (number % 2 == 0) {
            return false; // Diğer çift sayılar asal değildir.
        }
        // Sadece tek sayılara bakıyoruz.
        for (int i = 3; i*i <= number; i ++) {
            if (number % i == 0) {
                return true; // Sayı bölenlere sahipse asal değildir.
            }
        }
        return false; // Sayı bölenlere sahip değilse asaldır.
    }

    public static void main(String[] args) {
        int num = 7; // Test için bir sayı seçelim.
        if (isPrime(num)) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " bir asal sayı değildir.");
        }
    }
}
