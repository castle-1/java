package java_20_12_15;

import java.util.Scanner;

public class CheolsuMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;

		do {
			System.out.print("두 정수와 연산자를 입력하시오. >>");
			int x = sc.nextInt();
			int y = sc.nextInt();
			char op = sc.next().charAt(0);

			Cheolsu cheolsu = new Cheolsu();
			cheolsu.setValue(x, y, op);
			cheolsu.calculate();

			System.out.println("계속 하시겠습니까? (1. yes/ 2. no)");
			retry = sc.nextInt();

		} while (retry == 1);
		sc.close();
	}

}
