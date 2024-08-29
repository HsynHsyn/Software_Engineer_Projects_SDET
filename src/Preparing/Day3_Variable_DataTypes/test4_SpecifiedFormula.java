package Day3_Variable_DataTypes;

public class test4_SpecifiedFormula {

	public static void main(String[] args) {
		
		/* Float ve double türlerinin arasındaki fark, virgülden sonraki ondalık kısımda tutabildikleri hane sayısıdır. 
		 * Bu yüzden bir float değişken sanal bellekte 32 bitlik yer tutarken, 
		 * double türündeki bir değişken 64 bit yer tutacaktır.
		 
		 Write a Java program to compute a specified formula.
		 * Specified Formula : 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		 */
	
		double result= 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(result);

	}

}
