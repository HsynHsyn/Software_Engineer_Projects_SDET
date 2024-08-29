package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task3_FrequencyOfTheWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        // sentence = sentence.toLowercase() or toUppercase()
        // word = word.toLowercase() or toUppercase()

        int count = 0;

        while (sentence.contains("Java")) { // we want to run infinite loop
            count++;
            sentence.replaceFirst("Java", ""); // "replaceFirst()" method finds first Java word
        }

        System.out.println("count = " + count);

    }
}
/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */