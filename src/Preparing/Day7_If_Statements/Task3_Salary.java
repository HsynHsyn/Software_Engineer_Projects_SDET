package Day7_If_Statements;

public class Task3_Salary {

	public static void main(String[] args) {

		int sales, bonus;
		double commisionRate,salary;
		
		sales =  5000;
		salary=10000;
		
		if (sales> 5000) {
			bonus = 500;
			commisionRate= 1.12;
			
			salary = salary*commisionRate+bonus;
			

		}
		System.out.println("Salary = " + salary);

		
	}

}
