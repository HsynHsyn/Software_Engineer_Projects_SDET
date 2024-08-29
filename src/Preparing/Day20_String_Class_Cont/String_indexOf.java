package Preparing.Day20_String_Class_Cont;

public class String_indexOf {
    public static void main(String[] args) {
        String word1 = "github";
        System.out.println(word1.indexOf("i"));
        System.out.println(word1.indexOf("hu"));
        System.out.println(word1.indexOf("java")); // return -1 because it is not in he word1

        System.out.println(word1.charAt(1));    // i

        // find position of '-' and check if space is on right and lef side
        String title = "Java - Google Search";
        int side= title.indexOf("-");
        System.out.println(title.indexOf("-"));
        System.out.println(title.charAt(side-1));
        System.out.println(title.charAt(side + 1));

        System.out.println("*****************************");

        String country =  " United States of America";
        int states = country.indexOf("States");
        System.out.println("Position of states :" + states);
        System.out.println("*****************************");

        // question
        String word2 = "java, c++, python, tomcat, eclipse";
        // check if c++ is in the word2
        // solution-1
        System.out.println(word2.contains(word2));
        System.out.println(word2.indexOf("c++"));

        // solution-2 contains()
        if(word2.contains("c++")){
            System.out.println("c++ is there");
        }else {
            System.out.println("c++ is not there");
        }
        // solution-3 indexOf()
        if (word2.indexOf("c++")> -1) {
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not there");
        }

    }
}
