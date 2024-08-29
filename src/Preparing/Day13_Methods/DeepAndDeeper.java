package Day13_Methods;

public class DeepAndDeeper {
	
	/*public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now I am now in deep");	// we can code like this also, we can code before main method
	}

	public static void deeper() {

		System.out.println("I am now in deeper");
	}*/

	public static void main(String[] args) {

		System.out.println("I am starting in main");
		deep();
		deeper();
		System.out.println("I am back in main");
		
	}
	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now I am now in deep");
	}

	public static void deeper() {

		System.out.println("I am now in deeper");

	
	}
	
	
}

