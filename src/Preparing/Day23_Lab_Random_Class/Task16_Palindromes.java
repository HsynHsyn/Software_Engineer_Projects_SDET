package Preparing.Day23_Lab_Random_Class;

public class Task16_Palindromes {
    public static void main(String[] args) {

        System.out.println(pal("level"));
        System.out.println(pal("levetl"));
        System.out.println(pal("racecar"));
        System.out.println(pal("topspot"));


    }
    public static boolean pal(String str) {
        // second solution
        /*String  dummy = "";
        for (int i =str.length() -1; i >= 0 ; i--) {
            dummy = dummy + str.charAt(i);
        } */

        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(str.length() - i - 1);
        }

        if (str.equals(str1)) {
            return true;
        } else {
            return false;
        }
    }
}

