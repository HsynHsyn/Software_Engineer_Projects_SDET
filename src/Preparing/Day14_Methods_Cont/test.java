package Preparing.Day14_Methods_Cont;

public class test {

	public static void main(String[] args) {

		int x = test();
		System.out.println(x);

	}

	public static int test() {
		int b = 0;
		int number = 50;
		for (int i = 3; i * i <= number; i += 2) {
			if (50 % i == 0) {
				return i;

			}
		}

        return b;
    }
}