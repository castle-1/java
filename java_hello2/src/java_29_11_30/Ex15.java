package java_29_11_30;

public class Ex15 {

	public static void main(String[] args) {//1 3 5

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
