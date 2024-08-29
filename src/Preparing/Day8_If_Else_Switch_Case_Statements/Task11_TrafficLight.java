/* Write a program to display traffic light colors using following logic:
if code (R/r)-->"Red"
if code (O/o)-->"Orange"
if code (G/g)-->"Green"*/

package Day8_If_Else_Switch_Case_Statements;

public class Task11_TrafficLight {

	public static void main(String[] args) {

		char trafficLight='r';
		
		switch(trafficLight) {
		
		case 'R':case 'r':
			System.out.println(trafficLight + " -->"+ " Traffic Light is Red" );
			break;
		case 'O':case 'o':
			System.out.println(trafficLight + " -->"+ " Traffic Light is Orange" );
			break;
		case 'G':case 'g':
			System.out.println(trafficLight + " -->"+ " Traffic Light is Green" );
			break;
		default:
			System.out.println("Invalid Light");

	
		}
	}

}
