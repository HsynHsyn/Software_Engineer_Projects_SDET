package Saturday_Reviews.week5;

public class Palindrome_Interview {
    public static void main(String[] args) {
        System.out.println( palindrome("abc"));
    }

    private static boolean palindrome(String str) {

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
/*
create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
    A palindrome is when the characters being read from the beginning match the characters being read from the end.
    In other words, the reverse order of the word is the same as the original word order

        Ex:
            racecar
            true

            anna
            true

            abc
            false

            abcba
            true
 */