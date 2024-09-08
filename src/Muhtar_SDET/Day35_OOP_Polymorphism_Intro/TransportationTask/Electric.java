package Muhtar_SDET.Day35_OOP_Polymorphism_Intro.TransportationTask;

public interface Electric {

    static void method1() { // interface accepts static methods
        System.out.println("Static Method");

    }

    // public abstract void method3(); // example

    // public void method4(); // example

    void charge();
}
/*
public static void method1() { // line 1
        System.out.println("Static Method");
    }

    public void method2() { // line 2// gives error
        System.out.println("Instance Method");
    }

    public abstract void method3(); // line 3

    public void method4(); // line 4
 */