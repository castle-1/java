package java_20_12_07;

import java.util.Scanner;

public class WeightMain {

	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;

		while (tf) {
			sc = new Scanner(System.in);
			System.out.println("키를 입력해주세요.");
			double height = sc.nextDouble();

			System.out.println("체중을 입력하세요.");
			double weight = sc.nextDouble();

			Weight person = new Weight(height, weight);
			person.show();

			System.out.println("표준체중을 더 검사하시겠습니까? (y/n)");
			String answer = sc.next();

			if (answer.equals("Y") || answer.equals("y")) {
				continue;
			} else {
				System.out.println("표준체중 검사를 종료합니다.");
				tf = false;
				break;
			}

		}
		sc.close();
	}

}
