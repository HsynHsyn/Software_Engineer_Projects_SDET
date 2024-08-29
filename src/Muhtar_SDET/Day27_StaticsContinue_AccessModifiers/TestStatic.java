package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class TestStatic {

    public static void main(String[] args) {

        new StaticInitializationBlock(); // created object
        System.out.println( StaticInitializationBlock.a );
        System.out.println( StaticInitializationBlock.b );
        System.out.println( StaticInitializationBlock.c );
    }
}
