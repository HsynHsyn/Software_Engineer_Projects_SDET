package Muhtar_SDET.A_PracticeQuestions.GroupStudy.Practice;

import java.util.Arrays;

public class StringMethods_ {
    public static void main(String[] args) {

        // toCharArray()
        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();
        char[] ch1 = str.toCharArray();
        ch[0] = 'H';
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));

        System.out.println("-----------------------------------------------");

        String str2 =  "Today is a great day to learn java";
        String[] words = str2.split(" "); // it gives String arrays
        String[] words1 = str2.split("great");
        System.out.println(Arrays.toString(words1));
        System.out.println(Arrays.toString(words));


    }
}
