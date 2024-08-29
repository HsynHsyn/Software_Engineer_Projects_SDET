package Day4_Arithmetic_Operators;

// this program calculates hourly wages plus overtime
public class Wages {
    public static void main(String[] args) {
    	double regularWage;// the calculateed regular wage
    	double basePay=25.75; // the base pay
    	double overTimeWages; // Overtime wages
    	double regularHours= 40; // the hours  worked less overtime
    	double overTimePay=37.5; // overtime pay rate
    	double overTimeHours=15;
    	double totalWage; // Total Wage
    	
    	regularWage = basePay*regularHours;
    	overTimeWages =overTimePay*overTimeHours;
    	
    	totalWage = regularWage+overTimeWages;
    	
    System.out.println("Wages for this week are $ " + totalWage);
    	
    	
    	
    	
    	
    
    }

}
