package Day12_Branching_Statements;

public class labelStatement {

	public static void main(String[] args) {

		int i=0;
		outer: // you can add onother name like hakan
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if (i==4) {
							break outer;
							
						}
					}
			}while (true);
			
		
	}

}
