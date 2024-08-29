package Saturday_Reviews.week8;

import java.util.Arrays;

public class Task7_Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (Arrays.equals(str1Arr,str2Arr)){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }




    }
}
