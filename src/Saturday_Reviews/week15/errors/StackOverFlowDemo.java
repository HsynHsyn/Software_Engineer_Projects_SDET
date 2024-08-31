package Saturday_Reviews.week15.errors;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        System.out.println("Hi");
        main(new String[]{});
    }
}
