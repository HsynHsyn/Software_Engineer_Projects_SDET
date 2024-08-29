package Preparing.Day21_String_Class_Cont;

public class StringSubstringIntroTrim {
    public static void main(String[] args) {

        String sentence = "Java String Manipulation is fun!";

        System.out.println(sentence.substring(2));
        System.out.println(sentence.substring(5,11));
        System.out.println(sentence.substring(5,sentence.length()-5));
        System.out.println(sentence.length());

        String chars = "{{}}";
        String word = "AUTOMATION";

        String result =  chars.substring(0,2) + word + chars.substring(2);
        System.out.println(result);

        System.out.println("************************");

        String sentence1 = "Java String Manipulation is fun!";

        System.out.println(sentence1.toLowerCase());
        System.out.println(sentence1.toUpperCase());
        System.out.println(sentence1.equalsIgnoreCase(sentence1));

        System.out.println("************************");

        String str =" 358 "; // |358|
        System.out.println(str.trim()); // the method removes whitespaces from both ends and starts of a string







    }
}
