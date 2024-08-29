/* 
 A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
program that declares three integers as angles and check whether a triangle is valid or
not.
  
 */

package Day8_If_Else_Switch_Case_Statements;

public class Task5_Angel {

	public static void main(String[] args) {
		
		double a = 10, b= 60, c = 70;
		
		double angel= a+b+c;
		
		
		if (angel ==180) {
			
			System.out.println("angel is "+ angel +" and" +" this is a triangle ");
		}else {
			
			System.out.println("angel is "+ angel +" and" +" this is not a triangle ");

		}

	}

}
