package Preparing.Day10_Ternary_Operator_For_Loop;

public class Ternary_Opeartor {
	public static void main(String[] args) {
	//example
	String result;
	int score=88;
	//
	/*if (score > 60) {
		result = "pass";
	}else {
		result="fail";
		
	}*/
	
	
	result = score>60 ? "pass": "fail"; // two code is the same as each other.
										//Also It's a condensed form of the if-else statement that also returns a value.
	
	System.out.println("****************************************");
	//example
	int x =5;
	System.out.println(x>2 ? x<4 ? 10: 8 : 7);
	
	if (x>2) {
		if (x<4) {
			System.out.println(10);
		}else {
			System.out.println(8);
		}
	}else {
		System.out.println(7);
		}
	
	System.out.println("****************************************");

	}
	
}
