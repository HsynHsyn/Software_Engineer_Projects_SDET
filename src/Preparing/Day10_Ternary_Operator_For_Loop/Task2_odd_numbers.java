/*Write a program that displays all odd numbers between 5-140 in same line*/

package Day10_Ternary_Operator_For_Loop;

public class Task2_odd_numbers {

	public static void main(String[] args) {
		
		for (int i=6; (i>5 && i<140); i=i+1) {
			
			if (i%2==1) {
				System.out.print(i + " ");
			}
			
		}

	}

}
