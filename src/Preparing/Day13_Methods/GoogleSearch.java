package Preparing.Day13_Methods;

public class GoogleSearch {

	public static void main(String[] args) {
		
		for (int i=0;i<100; i++) {
			navigateGoogle();
			searchForshoes();
			printResults();
		}
	}
	
	public static void navigateGoogle() {
		System.out.println("lunch chrome browser");
		System.out.println("navigate to google.com");
	}
	
	public static void searchForshoes() {
		
		System.out.println(" type shoes into search field");
		System.out.println(" click on into search button");

	}
	public static void printResults() {
		
		System.out.println(" result for shoes ....");
	

}
}