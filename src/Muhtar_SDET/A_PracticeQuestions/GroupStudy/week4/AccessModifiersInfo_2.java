package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week4;

import Muhtar_SDET.Day27_StaticsContinue_AccessModifiers.AccessModifiers;

public class AccessModifiersInfo_2 {

    /*
    Access Modifiers:	public > protected > default > private (accessible level )
     */

    public static int publicData = 200; // accessible in same class
    // accessible in same package
    // always accessible in different package

    protected static int protectedData = 300; // accessible in same class
    // accessible in same package
    // not always accessible  in different package , sometimes can subclass

    static int defaultDate = 400;   // this is default, default does not have access modifier
    // accessible in same class
    // accessible in same package
    // not accessible in different package

    private static int privateData = 500; // only visible within class
    // not accessible in different class
    // not accessible in different packages

    public AccessModifiersInfo_2(){

    }

    public static void publicMethod(){
        System.out.println("public");
    }
    protected static void protectedMethod(){
        System.out.println("protected");
    }
    static void defaultMethod(){
        System.out.println("Default");
    }
    private static void privateMethod(){
        System.out.println("private");
    }



    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
