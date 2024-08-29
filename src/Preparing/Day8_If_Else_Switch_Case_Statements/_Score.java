/*Write a Java Program for the following logic:
 If marks < 60, then print “Fail”
 If marks >= 60, but less than 90, then print “Pass”
 If marks >= 90, then print “Passed with Distinction”*/


package Day8_If_Else_Switch_Case_Statements;

public class _Score {

	public static void main(String[] args) {
		
		double marks = 100;
		
		if (marks<60) {
			System.out.println("Fail");
		}else if (marks>=60 && marks <=90){
			System.out.println("Pass");
		
		}else if (marks >=90) {
			System.out.println("Passed with Distinction");

		}else {
			System.out.println("invalid Score");
		}

	}

}
