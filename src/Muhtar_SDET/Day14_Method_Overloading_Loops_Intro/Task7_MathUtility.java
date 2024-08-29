package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class Task7_MathUtility {
    public static void main(String[] args) {

        System.out.println(calculate (1,2,'+'));
        System.out.println(calculate(2.5, 3.0, '*'));
        System.out.println(square(8));
        System.out.println(square(1.5));
        System.out.println(cube(3));
        System.out.println(cube(2.5));

    }
    public static int calculate(int num1, int num2, char mathOperator) { //Overloading
        int result = 0;
        switch (mathOperator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result= 0;
        }
        return result;
    }
    public static double calculate(double num1, double num2, char mathOperator) { //Overloading
        double result = 0;
        switch (mathOperator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result= 0;
        }
        return result;
    }
    public static int square(int num) { //Overloading // one parameter is enough for square because we use other methods attributes

        int result = calculate (num, num,'*');
        return result;
    }
    public static double square(double num) { //Overloading // one parameter is enough for square because we use other methods attributes

        double result = calculate (num, num,'*');
        return result;
    }
    public static int cube(int num) { //Overloading // one parameter is enough for cube because we use other methods attributes

        int result = calculate (num, num,'*') * num;
        return result;
    }
    public static double cube(double num) { //Overloading // one parameter is enough for cube because we use other methods attributes

        double result = calculate (num, num,'*') * num;
        return result;
    }

}

/*
 Create a class named MathUtility:
5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */