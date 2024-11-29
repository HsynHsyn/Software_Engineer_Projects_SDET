package Muhtar_SDET.A_Review.CodingBat.string;

public class Bat1_doubleChar {
    public static void main(String[] args) {

        System.out.println("doubleChar(\"The\") = " + doubleChar("The"));
    }

    public static String doubleChar(String str) {

        String doubleChar1 = "";

        for(int i = 0; i< str.length();  i++){
            doubleChar1 += str.charAt(i) +""+ str.charAt(i);
        }


        return doubleChar1;
    }
}

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
