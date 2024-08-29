package Day4_Arithmetic_Operators;

public class contrubition {
    public static void main(String[] args) {
    	
    	/* This program calculates the amount of pay that will be 
    	 * contributed to a retirement plan 
    	 * if 5%, 8% or 10% of monthly pay is withheld */
    	
    	int amountOfPay=6000;
    	double plan1 = amountOfPay*5/100;
    	double plan2 = amountOfPay*8/100;
    	double plan3 = amountOfPay*10/100;
    	
    	System.out.println("5 percent is $ " + plan1 + " per month.");
    	System.out.println("8 percent is $ " + plan2 + " per month.");
    	System.out.println("8 percent is $ " + plan3 + " per month.");
 	
    }

}
