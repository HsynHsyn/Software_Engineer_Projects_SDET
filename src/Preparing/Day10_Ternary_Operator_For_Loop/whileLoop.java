package Day10_Ternary_Operator_For_Loop;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		while (i<=10) {
			System.out.println(i);
			i+=1;
					
		}
		System.out.println("***************");

	}

    public static class forLoopExample {
            public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int num = number.nextInt();

                if (num<0){
                    System.out.println(num+ " is negative");
                }else if (num>0){
                    System.out.println(num + " is positive");
                }else {
                    System.out.println(num + " is zero");
                }
            }
        }
}
