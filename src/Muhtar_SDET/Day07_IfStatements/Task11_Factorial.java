package Muhtar_SDET.Day07_IfStatements;

public class Task11_Factorial {

    public static void main(String[] args) {
        //5 * 4 * 3 * 2 * 1 = 120

        int n = 5;
        int factorial = 1;

        // Initialize the factorial result to 1 (as 0! is 1)
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        }
}

/*
/*
    Use a `loop` to calculate the factorial of the given number `n`. In mathematics a `factorial` number is a positive integer that is the product of all the positive integers less than or equal to the `n` number.
    It is commonly written as `n!` In other words, a factorial value is the number multiplied to the number less than it, multiplied by the number less than it, repeating until 1. See the examples for clarification.

    Ex:
      Input:
        5
      Output:
        120
      -> The calculation would be:
        5 * 4 * 3 * 2 * 1 = 120

    Ex:
      Input:
        8
      Output:
        40320
      -> The calculation would be:
        8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 40320
 */