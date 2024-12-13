package Muhtar_SDET.A_PracticeQuestions.CodingBat.string;

public class Bat5_endOther {
    public static void main(String[] args) {


        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String first, String second) {

        // Convert both strings to lowercase to make the comparison case-insensitive
        String lowerStr1 = first.toLowerCase();
        String lowerStr2 = second.toLowerCase();

        // Check if one string ends with the other
        if (lowerStr1.endsWith(lowerStr2) || lowerStr2.endsWith(lowerStr1)){
            return true;
        };
        return false;

    }


}

/*
Given two strings, return true if either of the strings appears at the very end of the other string,
 ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
  Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */