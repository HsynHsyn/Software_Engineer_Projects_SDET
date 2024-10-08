/*
Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123
124
...

431
432
Total number of the three-digit-number is 24
 */

package Preparing.Rewieving;

public class NewTask5_UniqueThreeDigit {
    public static void main(String[] args) {
        int amount = 0;

        // Iterate through three nested loops to generate all unique three-digit numbers
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Check if 'i,' 'j,' and 'k' are all different (not equal)
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k); // Print the generated three-digit number
                    }
                }
            }
            // Display the total number of generated three-digit numbers
            System.out.println("Total number of the three-digit-number is " + amount);
        }
    }
}