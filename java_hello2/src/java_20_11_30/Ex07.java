package java_20_11_30;

public class Ex07 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if ((i * j) % 2 == 0) {

					System.out.println(i + "x" + j + "=" + i * j);
				}

			}

			System.out.println();
		}

	}

}
