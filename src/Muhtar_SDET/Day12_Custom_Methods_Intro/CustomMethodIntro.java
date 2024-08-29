package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class CustomMethodIntro {
    // we can create method this body
    // you cannot create a method which is inside in any method
    // we can create as many as we want

    public static void main(String[] args) {

       greetings();
       displayMessage();

    }
    // we can create method this body
    // public static are modifiers, public and static modifiers are optional void must ,void is return type
    // *** static modifier/specifier = Allow us to call the method through the class name
    public static void greetings(){
        System.out.println("Hello Cydeo!");
        System.out.println("How are you today ?");
    }

    public static void displayMessage(){

        System.out.println("Hello World");
    }
}
