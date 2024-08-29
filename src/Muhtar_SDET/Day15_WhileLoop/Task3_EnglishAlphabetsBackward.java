package Muhtar_SDET.Day15_WhileLoop;

public class Task3_EnglishAlphabetsBackward {
    public static void main(String[] args) {
        //creating a empty string variable to assign letters
        String alphabetLetters = "";
        for (char i = 'Z'; i >= 'A'  ; i--) { // Assignment Operators must be -- because Z value is greater than A values
            alphabetLetters += i + " "; // we create addition assignment and assigned to string values
        }
        System.out.print("Alphabet letters are: " + alphabetLetters ); // uses print to write in the same line
    }
}
/*
Create a class named EnglishAlphabetsBackward, and write a program that can display the alphabet letters from Z to A in
the same line separated by a space.
 */