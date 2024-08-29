package Saturday_Reviews.week7;

    public class Fibonacci2 {
        public static void main(String[] args) {
            //0, 1, 1, 2, 3, 5, 8, 13.....
            int first = 0;
            int second = 1;
            int next = first + second;
            System.out.print(first + " ");
            System.out.print(second + " ");
            System.out.print(next + " ");

            //print until 5th fibonacci sequence number
            for (int i = 1; i <= 5; i++) {
                first = second;
                second = next;
                next = first + second;
                System.out.print(next + " ");
            }
        }
    }

/*
   loop from 1 to 100
   and print FizzBuzz for numbers divisible by 3 and 5
   print Fizz to number is divisible by 3
   print Buzz to numbers divisible by 5
   Otherwise print the number itself
 */