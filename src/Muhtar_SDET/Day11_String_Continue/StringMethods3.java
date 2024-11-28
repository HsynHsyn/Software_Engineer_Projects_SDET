package Muhtar_SDET.Day11_String_Continue;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "Java";
        boolean r1 = word.isEmpty(); // false
        String word2 = "";
        System.out.println(word2.isEmpty()); // true
        //--------------------------------------------------

        String str = "        ";
        boolean r2 =  str.isEmpty();//false
        boolean r3 = str.isBlank(); //true

        //--------------------------------------------------
        //equals(str): checks if two string has the same text. returns boolean
        //Cannot ignore case sensitivity
                                   //DO NOT use == to compare two strings. use .equals()
        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));//true // context

        //--------------------------------------------------
        //equalsIgnoreCase(str):  checks if two strings are equal without case sensitivity

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
        //--------------------------------------------------

       // contains(str): checks if the given str is contained in the string. returns boolean  (has)
      String sentence = "My favorite programming languages are: C#, Java, JavaScript"   ;
       //sentence.contains("Python") //false
        System.out.println(sentence.contains("#,"));

        //--------------------------------------------------

        //startsWith(str): checks if the string is started with given str. returns boolean
        //sentence = "Cybertek School is the best"
        //sentence.startsWith("Cybertek")
        //endsWith(str): checks if the string is ended with given str. returns boolean

        String name = "Michael";
        boolean l = name.startsWith("DA");
        boolean k = name.endsWith("l");

    }
}
