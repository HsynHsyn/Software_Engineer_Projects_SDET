package Muhtar_SDET.Day13_Custom_Methods_Continue;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        int total = sum(20,40);
        System.out.println(total);
        System.out.println(square(10));
        System.out.println(cube(10));

    }
    public static int sum(int n1, int n2) {
        int result = n1 +n2;

        return result;

    }
    public static int square(int num) {

        int square = num * num ;
        return square;
    }
    public static int cube(int num) {  // method name and variable name can be same

        int cube = square(num) * num ;
        return cube;
    }


}
