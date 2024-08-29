package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class StaticBloc_vs_InstanceBlock_vs_Constructor {
    // static and instance block do not take any arguments
    // main difference between static and instance block , *** static block does not execute more than once ,*** instance block depends on instance number
    // *** instance block executes before constructor

    public StaticBloc_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    { // instance block
        System.out.println("Instance Block");
    }

    static {// static block
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        new StaticBloc_vs_InstanceBlock_vs_Constructor();
        new StaticBloc_vs_InstanceBlock_vs_Constructor();



    }


}
