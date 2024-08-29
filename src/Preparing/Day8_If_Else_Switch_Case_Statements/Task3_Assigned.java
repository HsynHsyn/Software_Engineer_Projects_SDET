/* Write an if-else statement that assigns 0 to the variable b and assigns
1 to the variable c if the variable a is less than 10. Otherwise, it should
assign –99 to the variable b and assign 0 to the variable c
 */

package Day8_If_Else_Switch_Case_Statements;

public class Task3_Assigned {

	public static void main(String[] args) {

		int a =10, b=20, c=30;
		
		if (a<10) {
			
			b=0;
			c=1;				
			
		}else {
			b=-99;
			c=0;
		}
		
		System.out.println("b= "+ b + "," +" c= "+ c);
	}

}
