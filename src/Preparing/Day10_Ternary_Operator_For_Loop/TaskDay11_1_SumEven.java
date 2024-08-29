/*Write a program using while loop, that calculates the sum of the even numbers between
0 and 100   */

package Day10_Ternary_Operator_For_Loop;

public class TaskDay11_1_SumEven {

	public static void main(String[] args) {
		
		int sumEven=0;
		int i=1;
		
		while (i<=100) {
		
			if (i%2==0) {
			
			sumEven = sumEven+i;
			}
			i+=1;
	}
	System.out.println(sumEven);
	}
}
