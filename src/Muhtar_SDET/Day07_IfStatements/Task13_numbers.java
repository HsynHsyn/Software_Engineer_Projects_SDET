package Muhtar_SDET.Day07_IfStatements;

public class Task13_numbers {
    public static void main(String[] args) {
//        int number = 50;
//
//        for (int i = 0; i <= 50; i++) {
//            System.out.println(i);
//        }
//
        // solution 2
        int j=0;
        while (true){
            if (j<=50){
                System.out.println(j);
                j+=1;
            }
        }

    }

}

/*
   Use a `loop` to print all the numbers from `0` to `50`.  Print each number on a new line

    Example Flow:

    0
    1
    2
    3
    4
    5
    ...
    48
    49
    50
 */