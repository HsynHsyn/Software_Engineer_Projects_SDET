/*Write a Java program to implement following logic using if statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening*/

package Day7_If_Statements;

public class Task8_Hour {

	public static void main(String[] args) {

		int hour = 18;
		
		if (hour<12) {
			
			System.out.println("Good Morning");
		}
		
		if (hour>=12 && hour <= 15) {
			
			System.out.println("Good Afternoon");
		}
		
		if (hour >= 15 ) {
			
			System.out.println("Good Evening");
		}
		
		
	}

}
