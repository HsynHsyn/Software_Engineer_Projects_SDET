/*Declare 3 numbers
• Program should display which one is largest*/

package Day8_If_Else_Switch_Case_Statements;

public class Task6_LargerNumber {

	public static void main(String[] args) {

		int a = 10, b= 20, c= 8;
		
		if ((a>b) && (a>c)) {
			System.out.println("a is larger number");
			
		}else if((b>c) && (b>a)) {
			System.out.println("b is larger number");
			
		}else if ((c>a) && (c>b)) {
			System.out.println("c is larger number");
		}else {
			System.out.println("Numbers are equal ");

		}
	}

}
