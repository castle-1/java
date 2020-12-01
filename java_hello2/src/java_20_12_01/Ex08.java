package java_20_12_01;

public class Ex08 {

	public static void main(String[] args) {

		starPrint(10);

	}

	public static void starPrint(int line) {
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
