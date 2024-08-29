package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class NestedLoopPractice {
    public static void main(String[] args) {

        String str =  "aaaaabbbbbbcccdddff";

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch =  str.charAt(j); // we find first character, str.charAt(1); str.charAt(2);
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and
                if (str.charAt(i)==ch) {            // return the frequency of ch
                    count ++;
                }

            }
            if ((count == 2) && (! result.contains(""+ch))) { // if any char`s frequency equals 2
                result += ch;
            }
        }

        System.out.println(result);
    }
}
