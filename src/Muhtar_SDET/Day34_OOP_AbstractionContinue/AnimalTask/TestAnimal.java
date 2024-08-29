package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog1 = null;
        Cat cat1 = null;

        boolean isDog = dog1 instanceof Animal;
        System.out.println(isDog);
    }
}
