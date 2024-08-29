package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task5_NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i < 5; i++) { // outer loop

            for (int j = 0; j < 5; i++) {// inner loop
                System.out.println("Wooden Spoon");

            }
        }
    }
}