package Muhtar_SDET.A_PracticeQuestions.CodingBat.string;

public class Bat4_countCode {
    public static void main(String[] args) {
        System.out.println(countCode("codexxcode"));

    }

    public static int countCode(String str) {

        int count = 0;
        for(int i = 0; i <= str.length()-4;i++){

            // substring returns string
            if (str.substring(i, i+4).startsWith("co") && str.substring(i, i+4).endsWith("e")){
                count ++;
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