package week11_review.string;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Return the shortest word in sentence
    findShortestWord("I love programming") => "I"
    findShortestWord("Cydeo school") => "Cydeo"
    findShortestWord("hi bye") => "hi"

    findAllShortestWords("hi bye my ky") => "hi,my,ky" , ["hi","my","ky"]
 */
public class T04ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShortestWord("I love programming"));
        System.out.println(findShortestWord("java is fun"));
        System.out.println(findShortestWord("hi"));

        System.out.println(Arrays.toString(findAllShortestWords("why bye hi my ky")));
    }
    //findAllShortestWords("why bye hi my ky")
    public static String[] findAllShortestWords(String sentence) {
        String[] arr = sentence.split(" ");
        //find shortest length
        int shortestLength = arr[0].length();
        for(String eachWord : arr) {
            if (eachWord.length() < shortestLength) {
                shortestLength = eachWord.length();
            }
        }
        //create arraylist and add all words with shortest length:
        ArrayList<String> shortsList = new ArrayList<>();
        for (String eachWord : arr) {
            if (eachWord.length() == shortestLength) {
                shortsList.add(eachWord);
            }
        }
        //convert arraylist to String[]
        return shortsList.toArray(new String[shortsList.size()]);
    }

    public static String findShortestWord(String sentence) {
        String[] arr = sentence.split(" ");
        String shortest = arr[0]; //start first word as shortest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }
        }

        return shortest;
    }
}