package Preparing.Day13_Methods;

public class LoopCallMethod {

	public static void main(String[] args) {

		System.out.println("hello from the main method");
		
		for(int i=0; i<5; i++) {
			displayMessage();
			System.out.println("Back inr the main method");
		}
	}

	public static void displayMessage() {
		System.out.println("Hello from display|Message method");
		
	}

}
