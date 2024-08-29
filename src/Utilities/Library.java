package Utilities;

public class Library {

    public static void sleep(double seconds)  {

        // if you use Utility method try/catch is better to use
        try {
            Thread.sleep( (long)(seconds * 1000) ); // sleep method takes long variables
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
