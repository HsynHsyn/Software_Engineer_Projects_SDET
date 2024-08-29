package Muhtar_SDET.Day06_IfStatements_Intro;

public class OdorEven {
    public static void main(String[] args) {
        int number=45;
        boolean isEven= number%2==0; // when we divide a number by 2, if the remainder is 0, means number is even
        boolean isOdd = number%2!=0; // when we divide a number by 2, if the remainder is not 0, means number is odd
        // boolean isOdd= !isEven

        System.out.println(number +" is an even number : " + isEven);
        System.out.println(number + "is an odd number: " + isOdd);
    }
}
