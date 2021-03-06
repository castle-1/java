package java_20_12_15;

import java.util.Scanner;

public class CheolsuMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		char op = ' ';
		int retry;

		do {
			System.out.print("두 정수와 연산자를 입력하시오. >>");

			try {
				x = sc.nextInt();
				y = sc.nextInt();
				op = sc.next().charAt(0);
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다.");
			}
			Calc calc = null;

			switch (op) {
			case '+': {
				calc = new Add();

				break;
			}
			case '-': {
				calc = new Sub();

				break;
			}
			case '*': {
				calc = new Mul();

				break;
			}
			case '/': {
				calc = new Div();

				break;
			}

			}
			calc.setValue(x, y);
			System.out.println(calc.Calculate());

			System.out.println("계속 하시겠습니까? (1. yes/ 2. no)");
			retry = sc.nextInt();

		} while (retry == 1);
		sc.close();
	}

}
