package Saturday_Reviews.week15.unchecked;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("First line");

        try {
            String word = "java";
            System.out.println(word.charAt(100));

        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Exception happened");
        }

        System.out.println("Last Line");
    }
}
