package Saturday_Reviews.week8;

public class Task3_Messages {
    public static void main(String[] args) {

        String[] messages = {"Hi",
                "Hi How are you?",
                "good, what are you doing?",
                "coding java",
                "Good job!",
                "Bye"};

        String[] newMessages = new String[messages.length];
        for (int i = 0; i < messages.length; i++) {
            System.out.println((i+1 ) + ". message "+ messages[i] + " -read");

        }
    }
}
