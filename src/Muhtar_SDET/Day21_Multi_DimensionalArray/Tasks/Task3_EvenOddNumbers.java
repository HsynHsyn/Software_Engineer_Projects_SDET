package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

public class Task3_EvenOddNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7}; // int array created

        int countEven = 0; // initialize with 0
        int countOdd = 0; // initialize with 0


        for (int number : array){ // we achieved all array elements with for each loop

          int result =  (number % 2 == 0) ? countEven ++:  countOdd++; // ternary statement

           /* if (number % 2 == 0){ // even number
                countEven ++;
            }else {             // odd numbers
                countOdd++;
            }*/
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);


    }
}

/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */