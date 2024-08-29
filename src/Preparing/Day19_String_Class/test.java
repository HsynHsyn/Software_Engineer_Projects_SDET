package Preparing.Day19_String_Class;

public class test {

    public static class ReturnExample {
        public static void main(String[] args) {
            String message = createGreeting("Ali");
            System.out.println(message);  // Output: Merhaba, Ali!
        }

        public static String createGreeting(String name) {
            String message = "Merhaba, " + name + "!";
            return message;
        }
    }


}