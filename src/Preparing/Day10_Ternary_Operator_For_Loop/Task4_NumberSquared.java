/*Write a Java Program to print the following table.
  Number   	Number Squared
----------------------------
1			1
2			4
3			9
4			16
5			25
6			36
7			49
8			64
9			81
10			100 */

package Day10_Ternary_Operator_For_Loop;

public class Task4_NumberSquared {

	public static void main(String[] args) {
		
		System.out.println("Number   	Number Squared");
		System.out.println("----------------------------");

		
		for (int number=1; number<=10;number+=1) {
			System.out.println(number+ "\t\t	" +number*number);
			
		}
	}

}
