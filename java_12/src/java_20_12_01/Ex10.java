package java_20_12_01;

public class Ex10 {

	public static void main(String[] args) {

		System.out.println("3 factorial : " + factorial(3));
		System.out.println("12 factorial : " + factorial(12));

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}
