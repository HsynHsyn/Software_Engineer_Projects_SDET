package Preparing.Day22_String_Class_Cont_Lab;

public class Task1_Greeting {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));

    }
        private static String helloName( String name) {
        String great = "Hello ".concat(name).concat("!");
        return great;


    }


}
/*
Create a method that accepts 1 string, e.g. "Bob", return a greeting of
the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */