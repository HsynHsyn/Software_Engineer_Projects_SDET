package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro;

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        // this(9); gives error

        System.out.println("Default");

    }

    public ConstructorCalls2(int a ) {
        this(); // calling the default constructor, must be at the first step
        System.out.println("int arg");

    }

    public ConstructorCalls2(String a) {
        this(5);
        System.out.println("String arg");

    }

    public static void main(String[] args) {
        ConstructorCalls2 obj1 = new ConstructorCalls2(); // Default

        System.out.println("___________________________________________________");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10); // Default , int arg

        System.out.println("___________________________________________________");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Hakan"); // Default , int arg, String arg



    }

}
