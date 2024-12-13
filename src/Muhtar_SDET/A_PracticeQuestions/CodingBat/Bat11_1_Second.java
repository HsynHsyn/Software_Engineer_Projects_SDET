package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat11_1_Second {
    public static void main(String[] args) {
        System.out.println(countCode("codexxcode"));
    }

    public static int countCode(String str){

        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            String  str1 = str.substring(i, i + 4);
            System.out.println(str1);
          if ((str1.charAt(0) == 'c' && str1.charAt(1) == 'o' && str1.charAt(3) == 'e') ){
                count++;

            }
        }

     return count;
    }
}
/*
Eğer hâlâ split() metodunu kullanarak bir çözüm elde etmek istiyorsanız, maalesef bu belirli problem için split() metodunun
 uygun olmadığını söylemem gerek. Bunun yerine yukarıdaki gibi döngü tabanlı bir çözüm kullanmanız daha doğru olur.
 */