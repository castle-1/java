package java_20_11_30;

public class Ex10 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				if ((i * j) % 2 == 0) {

					count++;
				}
				System.out.println(i + "x" + j + "=" + i * j);

			}

			System.out.println();
		}
		System.out.println("짝수의 개수 : " + count);

	}

}
