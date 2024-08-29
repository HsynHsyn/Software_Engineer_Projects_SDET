package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        // Any class from java.lang package is will be import implicitly, no need to import
        /*
        Array       : size is fixed, supports both primitives & non-primitives, can be multidimensional
		Collection  : size is dynamic, ONLY supports non-primitives
		Map         : size is dynamic, ONLY supports non-primitives
		Wrapper classes =  it is used to wrap from primitive to object data
		*** Wrapper classes do not accept other classes ex// Integer class does not accept Byte class
		** auto boxing and unboxing happen implicitly
         */

        int a1 = 10;
        Integer a2 = 10; // when any data structure does not accept int we must use wrapper class

        System.out.println("--------------------------");

        int b1 = 100;
        Integer b2 = new Integer(b1); // it is created an object
        Integer b3 = b1; // auto boxing

        char ch = 'A';
        Character ch2 = ch; // auto boxing

        System.out.println("--------------------------");
        Integer n1 = 20;
        int n2 = n1 ; // best practice own (ex: must be int ) primitive // unboxing
        long n3 = n1; // not good practice

        Character e1 = 'Z'; // unboxing
        char e2 = e1 ;








    }
}
