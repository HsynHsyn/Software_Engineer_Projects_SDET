/*Write a program that lets user to enter apple,dell,acer laptop models
If it is apple show “Apple-no virus”
If it is dell show “Tough one”
If it is acer show “Not recommended”
Else “do not buy that one!” by using switch statements*/

package Day8_If_Else_Switch_Case_Statements;

public class Task9_Models {

	public static void main(String[] args) {
		
		String models="apple";
		
		switch(models) {
		
		case "apple" :
			System.out.println("Apple-no virus");
			break;
			
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy that one!");
		
		}

	}

}
