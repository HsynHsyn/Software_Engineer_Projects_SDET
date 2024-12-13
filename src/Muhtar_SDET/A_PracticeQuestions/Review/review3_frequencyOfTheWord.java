package Muhtar_SDET.A_PracticeQuestions.Review;

public class review3_frequencyOfTheWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva JAVA JAVA ".toLowerCase();
        String word ="Java".toLowerCase();

        int count = 0;

        while (sentence.contains("java")) {
            count++;
            sentence = sentence.replaceFirst("java", " ");

            }
        System.out.println(count);


    }
}
/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */