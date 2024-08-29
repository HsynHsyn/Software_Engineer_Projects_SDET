package Day5_UnaryAssignment_Relational_LogicalOperators;

public class example {

	public static void main(String[] args) {

		double x = 20, y=80;
		
		double z = (x=y)*25;
		
		double t = (x+y+z)/40;
		
		System.out.println((x+y+z+t)<=20);
	}

}
