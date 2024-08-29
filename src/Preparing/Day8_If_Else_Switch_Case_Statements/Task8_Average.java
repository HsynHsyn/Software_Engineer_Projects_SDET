/*The marks obtained by a student in 3 different subjects are input by the user. Your
program should calculate the average of subjects. The student gets a grade as per the
following rules:
AVERAGE GRADE
90-100 A
80-89 B
70-79 C
60-69 D
0-59 F */


package Day8_If_Else_Switch_Case_Statements;

public class Task8_Average {

	public static void main(String[] args) {

		int math=100;
		int chemistry=70;
		int biology=90;
		
		double avarage = (math+chemistry+biology)/3;

		if (avarage>=0 && avarage <=59) {
			System.out.println("Your avarage is " + avarage+" and "+ "grade is F");
		}else if (avarage>=60 && avarage <=69) {
			System.out.println("Your avarage is " + avarage+" and "+ "grade is D");
		}else if (avarage>=70 && avarage <=79) {
			System.out.println("Your avarage is " + avarage+" and "+ "grade is C");
		}else if (avarage>=80 && avarage <=89) {
			System.out.println("Your avarage is " + avarage+" and "+ "grade is B");
		}else if (avarage>=90 && avarage <=100) {
			System.out.println("Your avarage is " + avarage+" and "+ "grade is A");
		}
	}

}
