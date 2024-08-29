/*Write a program to display days:
1-Monday
2-Tuesday
3-Wednesday
4-Thursday
5-Friday
6-Saturday*/


package Day8_If_Else_Switch_Case_Statements;

public class Task10_Days {

	public static void main(String[] args) {
		
		String days = "1";
		
		switch(days) {
		
		case "1":
			System.out.println(days+" - Monday");
			break;
		case "2":
			System.out.println(days+" - Tuesday");
			break;
		case "3":
			System.out.println(days+" - Wednesday");
			break;	
		case "4":
			System.out.println(days+" - Thursday");
			break;	
			
		//default:
		//System.out.println(days+" - Monday");
		
		case "5":
			System.out.println(days+" - Friday");
			break;	
		case "6":
			System.out.println(days+" - Saturday");
			break;
		default:
			System.out.println(days+" - Sunday");
			break;

		}
		

	}

}
