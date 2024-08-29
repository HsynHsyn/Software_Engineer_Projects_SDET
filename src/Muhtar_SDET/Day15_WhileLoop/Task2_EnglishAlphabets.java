package Muhtar_SDET.Day15_WhileLoop;

public class Task2_EnglishAlphabets {
    public static void main(String[] args) {
            //char ch = i; // second solution if i is int data type
            for (char i = 'A'; i <= 'Z'; i++) { // datatype must be char and this alphabet letters have number,
                                                // so we can use logical operators
                System.out.print(i + " ");
            }
    }
}

/*
Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
same line separated by a space.
 */