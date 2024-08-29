//Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100

package Preparing.Day10_Ternary_Operator_For_Loop;

public class Task3_sumof_even_and_odd {

	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<100; i+=1) {
			if (i%2==0) {
//				System.out.println(i);
				sumEven=sumEven+i;
			}else {
//				System.out.println(i);
				sumOdd=sumOdd+i;
			}
		}
		
		System.out.println("Sum of odd number is "+ sumOdd);
		System.out.println("Sum of even number is " + sumEven);
	}

}
