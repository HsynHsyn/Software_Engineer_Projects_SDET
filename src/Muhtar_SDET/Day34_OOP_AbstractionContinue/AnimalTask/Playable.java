package Muhtar_SDET.Day34_OOP_AbstractionContinue.AnimalTask;

public interface Playable {
    // every single interface which has abstract method
    // only creates final and static variable
    //public static boolean isFriendly = true; // default is public access modifier and use static
    boolean isFriendly = true; // isFriendly is both static & final,

/*
    private static void main(String[] args) { // it is checked if isFriendly is static or not
        //isFriendly = false; // gives error because isFriendly is final variable
        System.out.println(isFriendly);
    }

    public default void method1(){ // it becomes instances method

    }*/

    //public abstract void play(); public abstract are optional because default
    void play(); // abstract

    public default void method1(){ // it becomes instances method

    }
}
