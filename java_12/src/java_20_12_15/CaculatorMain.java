package java_20_12_15;

import java.util.Scanner;

public class CaculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 숫자를 입력하세요.>>");
		int x = sc.nextInt();

		System.out.print("2번 숫자를 입력하세요.>>");
		int y = sc.nextInt();

		System.out.print("op를 입력하세요>>");
		char op = sc.next().charAt(0);

		Calculator2 calculator2 = new Calculator2(x, y, op);
		calculator2.show();

	}

}
