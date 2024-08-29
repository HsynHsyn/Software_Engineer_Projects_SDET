package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

public class ConstructorsIntro {

    // *** instance block runs before the constructor **
    // Static belongs to the Class, objects comes from Class
    // without Constructor there can be no object
    // Class must have Constructor(special method)

    public ConstructorsIntro(){
        System.out.println("object is created by using no argument constructor");
    }
    public ConstructorsIntro(String a){
        System.out.println("object is created by using string argument constructor");
    }
    public ConstructorsIntro(int a){
        System.out.println("object is created by using int argument constructor");
    }

    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro("hakan");
        ConstructorsIntro obj2 = new ConstructorsIntro();
        ConstructorsIntro obj3 = new ConstructorsIntro();
    }


}
