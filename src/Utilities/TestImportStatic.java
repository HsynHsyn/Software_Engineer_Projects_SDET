package Utilities;

import Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.AccessModifiers;
import Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.Data;


public class TestImportStatic {
    public static void main(String[] args) {

        // calls static members
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        // calls instances members
        Data obj = new Data(); // we must create object
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        // System.out.println(AccessModifiers.privateData); // not accessible
       // System.out.println(AccessModifiers.defaultData);

        new AccessModifiers();
        AccessModifiers.publicMethod();
       // AccessModifiers.protectedMethod(); // not accessible
       // AccessModifiers.privateMethod(); // not accessible
      //  AccessModifiers.defaultMethod();// not accessible


    }
}
