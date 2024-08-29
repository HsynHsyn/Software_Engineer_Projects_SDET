package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class InstanceBlock {

    // *** instance block runs before the constructor **
    // Static belongs to the Class, objects comes from Class
    // *** without Constructor there can be no object
    // Class must have Constructor(special method)

    {// known as Instance block or instance initialization
        System.out.println("Instance block"); // the more Instance you create the more Instance block runs
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();


    }
}
