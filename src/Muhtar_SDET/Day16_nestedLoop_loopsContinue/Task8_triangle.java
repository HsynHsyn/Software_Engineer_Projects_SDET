package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task8_triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.print("\t\t");
            for (int j = 0; j <= i; j++) {
                System.out.print( " * ");

            }

            System.out.println();

        }
    }
}
/*
Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */