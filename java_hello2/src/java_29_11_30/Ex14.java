package java_29_11_30;

public class Ex14 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
