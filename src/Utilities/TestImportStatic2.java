package Utilities;

//import Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Data;
//import static Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Data.d;
//import static Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Data.method3;
import static  Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Data.*; // all static members from Data Class

public class TestImportStatic2 {
    public static void main(String[] args) {

       // System.out.println(Data.d);
        System.out.println(d);
        method3();
        System.out.println(e);
        method4();

        // do not call instance members
        //System.out.println(a);
        //System.out.println(a);
        //System.out.println(a);
        //method1();
        //method1();

    }
}
