package Day8_If_Else_Switch_Case_Statements;

public class switchCaseStatements {

	public static void main(String[] args) {

		String weather= "sunny";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
			
		case "hot":
			System.out.println("Go to Swimming");
			System.out.println("Code Java");
			break;
			
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
			
		default:
			System.out.println("Code Java in any other condition");

		}
	}

}
