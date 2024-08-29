package Muhtar_SDET.Day31_Method_Overriding;

class A{ // default access modifier, when it is created second class in same file,
        // default access modifier is only and  must be used

    public int a = 100;
}

// variables names can not be duplicated
public class FieldHiding extends A{

    public int a = 300;

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a); // 300 , implicitly
        System.out.println(new A().a); //100
    }
}
