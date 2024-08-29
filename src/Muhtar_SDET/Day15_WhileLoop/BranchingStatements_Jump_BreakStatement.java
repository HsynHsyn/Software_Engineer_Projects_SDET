package Muhtar_SDET.Day15_WhileLoop;

public class BranchingStatements_Jump_BreakStatement { // jump statement
    public static void main(String[] args) {

        // break statement, terminates switch/loop
        // break statement, exits the current method

        for (int i = 0; i < 10; i++) {

            if (i == 6) { // if i`s value reaches 6 exit the loop
                break; // terminating the loop
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        for (char i = 'A'; i < 'Z' ; i++) {

            /*
            if (i == 'J') { // we cant see 'J' in the print
                break;
            }
             */
            System.out.println(i);

            if (i == 'J') {
                break;
            }

        }
        System.out.println("--------------------------------");
        for (;;) {
            System.out.println("hello");
            break;
            // System.out.println("hello"); // you cannot type code after break it will give compile error

        }

    }
}
