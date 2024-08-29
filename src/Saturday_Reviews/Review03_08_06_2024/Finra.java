package Saturday_Reviews.Review03_08_06_2024;

public class Finra {
    public static void main(String[] args) {

        int number = 15;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        } else if (number % 3 == 0 ) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");

        }else{
            System.out.println("Number is: " + number);
        }
    }
}

/*
{IQ} Finra [multibranch, operators]

    Create a program that will print the given number.
    if if the number is a divisible by 3 and 5 print "FINRA" instead of the number
    if the number is a divisible by 3 print "FIN" instead of the number.
    If the number is a divisible by 5 print "RA" instead of the number.
    Otherwise print the number itself

        ex:
            number: 3
            output: FIN

            number: 10
            output: RA

            number: 15
            output: FINRA

            number: 7
            output: 7

    Hint: you will be checking for divisibility, so you will need to use the % operator
 */