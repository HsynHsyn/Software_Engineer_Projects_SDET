/* Write a program to print only vowel (a,e,o,i,u) in given string
String word = "CybertekSchool";
Output: e,e,o,o
*/


package Preparing.Day19_String_Class;

public class PrintVowel {

    public static void main(String[] args) {

       String word = "CybertekSchool";
       for(int i=0; i<word.length(); i++){
           char letter=word.charAt(i);
           if(letter=='a' || letter=='e'|| letter=='o'|| letter=='i'|| letter=='u'){
               System.out.print(letter + ",");
               if (i!=word.length()-2){
                   System.out.print(",");
               }
           }
       }



    }

}
