package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task9_triangle2 {
    public static void main(String[] args) {

        int size = 9;

        System.out.println(size / 7);

        for (int i = 1; i <= size; i += 2) {
            for (int h = 1; h < size - i; h += 2) {
                System.out.print("  ");
            }
            for (int h = 1; h <= i; h++) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }
}