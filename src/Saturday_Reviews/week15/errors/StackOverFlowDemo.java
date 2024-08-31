package Saturday_Reviews.week15.errors;

public class StackOverFlowDemo {
    static int counter = 0;
    public static void main(String[] args) {
      //  System.out.println("Hi " + counter ++);
       // main(new String[]{});
        hello();
    }
    public static void hello(){
        System.out.println("hello " + counter++);
        if (counter > 1000){
            return;
        }
        hello();
    }
}
