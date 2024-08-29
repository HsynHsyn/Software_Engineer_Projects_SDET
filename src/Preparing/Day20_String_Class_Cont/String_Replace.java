package Preparing.Day20_String_Class_Cont;

public class String_Replace {
    public static void main(String[] args) {
        String str = "Moscow is a capital of Russia to Russia";
        String str1 = "Moscow is a capital of Russia";
        str = str.replace("Moscow","Baku").replace("Russia","Azerbaijan");
        str = str1.replace("Moscow","Baku").replace("Russia","Azerbaijan");

        System.out.println(str);

        System.out.println("*****************************************");
        String sentence= " Coding is fun, it is my hobby";
        String withNoSpace=sentence.replace(" ","");
        System.out.println(withNoSpace);

        System.out.println("*****************************************");
        String mixed = "Moscow is a capital of Turkey to Turkey";
        String mixedNew=mixed.replace("Moscow",""); // we can cut some part of string
        System.out.println(mixedNew);
        String mixedNew1= mixed.replace("Moscow","The Uk").replace("capital","Great Britain").replace("of","in");
        System.out.println(mixedNew1);

        System.out.println("*****************************************");







    }
}
