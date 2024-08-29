package Muhtar_SDET.Day27_StaticsContinue_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    // can not pass the argument inside instance block
    {
        name = "james"; // default name
        age = 20;       // default age
    }

//    public InstanceInitializationBlock(String name, int age){
//        this.name = name;
//        this.age = age;
//
//    }


    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock(); // runs instance block
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name); // james default
        System.out.println(obj2.name); //james default

       // InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Hakan",5);
       // InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Halime",35);

         System.out.println(obj1.name);
         System.out.println(obj2.name);

    }
}
