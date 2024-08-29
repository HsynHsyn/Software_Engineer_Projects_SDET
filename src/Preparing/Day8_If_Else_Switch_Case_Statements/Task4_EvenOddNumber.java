/*Write a Java program:
1) Declare and initialize a number
2) Display whether the number is an odd number or even number.*/

package Day8_If_Else_Switch_Case_Statements;

public class Task4_EvenOddNumber {

	public static void main(String[] args) {

		int number = 11;
		
		if (number%2 == 0) {
			
			System.out.println("number "+ number+ " is a even number");			
			
		}else {
			
			System.out.println("number "+ number+ " is a odd number");			
		}
		
	}

}
