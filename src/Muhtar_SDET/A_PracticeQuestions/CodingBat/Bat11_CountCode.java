package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat11_CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("cozexxcope"));
    }

    public static int countCode(String str) {

        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
           String str1 = str.substring(i, i + 4);

            if (str1.startsWith("co") && str1.endsWith("e")) {
                count++;
            }
        }

        return count;
    }
}
/*
Return the number of times that the string "code" appears anywhere in the given string,
 except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */