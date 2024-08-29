package Preparing.Day13_Methods;

public class Task3_GraterNumber {

	public static void main(String[] args) {

		graterNumber();
		
	}

	public static void graterNumber() {

		int num1=10, num2=10;
		if (num1>num2) {
			System.out.println(num1 +" is greater than number " + num2);
					
		}else if (num2>num1){
			System.out.println(num2 +" is greater than number " + num1);

		}else {
			System.out.println("Numbers are equal");

		}
	}

}
