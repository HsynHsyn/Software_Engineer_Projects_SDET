package Saturday_Reviews.week7;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {       // it is used for loop because we know the ending point

            if (i % 3 == 0 && i % 5 == 0 ) {   // it should give zero remainder when divide both 3 and 5 in this condition
                System.out.println("FizzBuzz ");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz ");     // it should give zero remainder when divides 3
            }else if (i % 5 == 0 ) {
                System.out.println("Buzz ");     //it should give zero remainder when divides 5
            }else {
                System.out.println(i + " ");  // other numbers will print this line
            }

        }

        System.out.println();

    }
}
/*
Based on a children's word game that helps teach division,
the FizzBuzz problem is simple: Print integers one-to-N,
but print “Fizz” if an integer is divisible by three,
 “Buzz” if an integer is divisible by five,
and “FizzBuzz” if an integer is divisible by both three and five.
 */