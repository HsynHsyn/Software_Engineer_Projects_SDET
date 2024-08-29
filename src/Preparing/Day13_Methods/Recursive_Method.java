package Preparing.Day13_Methods; // kendini tekrar cagiran method

public class Recursive_Method {

//    public static int f(int x) {
//
//        int toplam = 0;
//        for (int i = 0; i <= 10; i++) {
//            toplam += i;
//
//        }
//        return toplam;
//    }

    public static int r(int x) {
        if (x == 1) {
            return 1;
        }
        return x + r(x - 1);
    }

    public static void main(String[] args) {
        // recursive method
        System.out.println(r(10));
    }

 }