package Rewieving;


public class R1_Nested_if_1 {

	public static void main(String[] args) {
		
		int typeSelection = 1;
		int drinkSelection = 2;
		double price = 0;
		String drink = "none";
		
		if (typeSelection==1) {
			System.out.println("HOT");
			if (drinkSelection==1) {
				price = 2.0;
				drink ="TEA";
				System.out.println(drink + " is = "+ price);
				
			}else if(drinkSelection==2){
				price = 4.0;
				drink ="COFFEE";
				System.out.println(drink + " is = "+ price);
				
			}else {
				System.out.println("Invalid Selection");
			}
		}else {
			System.out.println("COLD");
			
			if (drinkSelection==1) {
				price = 3.2;
				drink ="ICED-TEA";
				System.out.println(drink + " is = "+ price);
						
			}else if(drinkSelection==2){
				price = 3.5;
				drink ="LEMONADE";
				System.out.println(drink + " is = "+ price);
				
			}else {
					System.out.println("Invalid Selection");
			}
		}
		
		
	}

}
