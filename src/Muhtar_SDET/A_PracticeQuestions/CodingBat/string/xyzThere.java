package Muhtar_SDET.A_PracticeQuestions.CodingBat.string;

public class xyzThere {

    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));

    }


    public static boolean xyzThere(String str) {
            for (int i = 0; i < str.length() - 2; i++) { // Loop until the third-to-last character
                if (str.substring(i, i + 3).equals("xyz")) { // Check if the current substring is "xyz"
                    if (i == 0 || str.charAt(i - 1) != '.') { // If it's at the start or not preceded by a '.'
                        return true;
                    }
                }
            }
            return false; // No valid "xyz" found
    }

}
/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by
 a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */