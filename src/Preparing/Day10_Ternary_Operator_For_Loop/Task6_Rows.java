/*Write a Java program to create pattern
*
**
***
****
*****
******
******* */

package Day10_Ternary_Operator_For_Loop;

public class Task6_Rows {

	public static void main(String[] args) {

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*"); // not "println", uses "print"
			}
			System.out.println();
		}
		
	}

}
