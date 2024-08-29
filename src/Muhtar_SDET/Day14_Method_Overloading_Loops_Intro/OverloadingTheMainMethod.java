package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class OverloadingTheMainMethod {
    public static void main(String[] args) { // first run others omit
        System.out.println("A");
    }
    public static void main(int[] args) {
        System.out.println("B");
    }
    public static void main(double[] args) {
        System.out.println("C");

    }
    public static void main(boolean[] args) {
        System.out.println("C");

    }

}
