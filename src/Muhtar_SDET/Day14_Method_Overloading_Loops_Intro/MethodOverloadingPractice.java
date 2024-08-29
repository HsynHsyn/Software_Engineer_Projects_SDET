package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(80,40));
        System.out.println(sum(80,40,50));
        System.out.println(sum(80,40,50,70));

        System.out.println(sum(2.5,3.5,4.0)); // match double methods

    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3) { // parameters must be different
        return sum(num1, num2) + num3;
    }
    public static int sum(int num1, int num2, int num3, int num4) { // parameters must be different
        return sum(num1, num2, num3) + num4;
    }
    public static double sum(double num1, double num2) { // datatype is different then public static int sum(int num1, int num2)
        return num1 + num2;
    }
    public static double sum(double num1, double num2,double num3) { // datatype is different then public static int sum(int num1, int num2, int num3)
        return sum(num1, num2) + num3; // it calls method which machs datatype
    }
    public static double sum(double num1, double num2,double num3,double num4) { // datatype is different then public static int sum(int num1, int num2, int num3)
        return sum(num1, num2,num3) + num4; // it calls method which machs datatype
    }
}