package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor"); // *** the more you have object the more Constructor runs ***
    }

    static{ // *** first static block runs, after main method ***
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        //objects
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }
}
