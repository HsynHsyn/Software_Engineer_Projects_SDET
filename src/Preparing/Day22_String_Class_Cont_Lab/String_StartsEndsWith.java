package Preparing.Day22_String_Class_Cont_Lab;

public class String_StartsEndsWith {
    public static void main(String[] args) {

        String word1= "eclipse";

        System.out.println(word1.startsWith("e")); // true
        System.out.println(word1.startsWith("ec")); // true
        System.out.println(word1.startsWith("ex")); // false

        System.out.println(word1.endsWith("e")); // true
        System.out.println(word1.endsWith("se")); // true
        System.out.println(word1.endsWith("te")); // false

        // isEmpty()-sadece bosluk and isBlank()-hem bosluk hem whitespace check eder

        String name = "Dr. Jackson";

        if (name.startsWith("Dr")){
            System.out.println("he is a doctor");
        }
    }
}
