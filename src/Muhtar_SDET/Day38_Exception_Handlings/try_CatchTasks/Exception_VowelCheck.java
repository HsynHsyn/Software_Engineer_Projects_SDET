package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

public class Exception_VowelCheck {
    public static void main(String[] args) {

        try {
            //String text = "Java handling and managing exceptions ";
            String text =" ";
                    System.out.println("Original string: " + text);
            checkVowels(text);
            System.out.println("String contains vowels.");
        }catch (NoVowelsException e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void checkVowels(String text) throws NoVowelsException {
        boolean containVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(""+text.charAt(i))){
                containVowels = true;
                break;
            }
        }
        if (!containVowels){
            throw new NoVowelsException("String does not contain any vowels.");
        }

        }
}

class NoVowelsException extends Exception{
    NoVowelsException (String message){
        super(message);
    }
}
/*
Java Exception Handling:

Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
 */