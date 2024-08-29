package Muhtar_SDET.A_Review.CodingBat;

public class Pr_BrokenKeyword {
    public static void main(String[] args) {

        System.out.println(canTypeSentence("abcdef", "bade"));

    }

    public static String canTypeSentence(String workingKeys, String sentence) {

        // for (char c : sentence.toLowerCase().toCharArray()) // for each method

        String noSpace = sentence.replace(" ", "").toLowerCase();

        for(int i = 0; i < noSpace.length(); i++){
            char letter = noSpace.charAt(i);
            if(workingKeys.indexOf(letter) == -1)
                return "Cannot Type";
        }

        return "Can Type";
    }
}



/*

working keys = "helotwrdg"
sentence  = Hello world
 */