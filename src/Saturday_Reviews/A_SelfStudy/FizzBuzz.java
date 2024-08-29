package Saturday_Reviews.A_SelfStudy;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz();

    }
    public static void FizzBuzz(){

        String result = "";
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
            }else if (i % 3 == 0) {
                result = "Fizz";
            }else if  (i % 5 == 0) {
                result = "Buzz";

            }else {
                System.out.println(i);
            }
            System.out.println(result); // at every loop it will give print

        }
        // not this area , it will give a print when the loop finish


    }
}
