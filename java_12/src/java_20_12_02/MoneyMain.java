package java_20_12_02;

import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;
		long price;
		while (tf) {
			sc = new Scanner(System.in);

			System.out.println("금액을 100단위까지만 입력하세요.");
			price = sc.nextLong();

			Money money = new Money(price);
			money.count();

			System.out.println("계속 하시겠습니까?(y/n)");
			String answer = sc.next();

			if (answer.equals("y") || answer.equals("Y")) {
				continue;

			} else {
				System.out.println("시스템이 종료되었습니다.");
				tf = false;
				break;

			}

		}
		sc.close();
	}
}
