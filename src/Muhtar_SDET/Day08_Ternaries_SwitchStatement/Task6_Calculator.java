package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class Task6_Calculator {
    public static void main(String[] args) {
        char mathOperator = 'k';

        double n1, n2 ;
                n1 = 32;
                n2 = 19;

                double result = 0;
                switch (mathOperator){
                    case '+':
                        result = n1 + n2;
                        break;
                    case '-':
                        result = n1 - n2;
                        break;
                    case '*':
                        result = n1 * n2;
                        break;
                    case '/':
                        result = n1 / n2;
                        break;
                    default:
                        System.out.println(mathOperator +" is invalid");
                }
                System.out.println("result = " + result);

       }
}

/*
 Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement
 */