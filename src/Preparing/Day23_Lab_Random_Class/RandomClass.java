package Preparing.Day23_Lab_Random_Class;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random rn = new Random();

        int random = rn.nextInt();
        int random2 = rn.nextInt(100);
        double randomDouble = rn.nextDouble();
        float randomFloat = rn.nextFloat();
        boolean randomBoolean = rn.nextBoolean();

        System.out.println(rn.nextInt(50));
        System.out.println(rn.nextInt(10));

        // 5 is boundary in there and, we should start with 5 and add 5 to 10 // 15 is not included
        System.out.println(rn.nextInt(10) +5); // 5-14






        }
    }
