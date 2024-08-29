package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;


    static { // we will be using in the future
        a= 100;
        b = 20.5;
        c = "Java";
    }
    // we should not be using any method initialize the static variables
    /*public static void main(String[] args) {
        a= 100;
        b = 20.5;
        c = "Java";
    }*/

    // *** Constructors only get executed with objects ***
    public StaticInitializationBlock(){

    }

}
