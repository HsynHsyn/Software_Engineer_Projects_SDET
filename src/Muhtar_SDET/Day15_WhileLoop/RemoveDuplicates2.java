package Muhtar_SDET.Day15_WhileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            if(result.contains("" + str.charAt(i)))  // if the character is already contained ibn the new string
                continue;

            result += str.charAt(i);



        }
    }
}
