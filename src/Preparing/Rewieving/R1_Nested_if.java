
package Preparing.Rewieving;

public class R1_Nested_if {


	public static void main(String[] args) {

		int hourOfday = 11;
		if (hourOfday<12) {
			System.out.println("Good morning");
		}else {
			if (hourOfday<17) {
				System.out.println("Good afternoon");
			}else {
				System.out.println("Good evening");
			}
		}
	}

}
