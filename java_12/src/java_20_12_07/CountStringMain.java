package java_20_12_07;

import java.util.Scanner;

public class CountStringMain {

	// 사용자로부터 받은 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성하라.
	// 영어 모음 a,e,i,o,u
	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;

		while (tf) {

			System.out.println("영문 문자열을 입력하세요.");
			sc = new Scanner(System.in);
			String userString = sc.next();

			CountString countString = new CountString(userString);
			countString.showCount();

			System.out.println("문자를 더 검사하시겠습니까? (y/n)");
			String answer = sc.next();

			if (answer.equals("Y") || answer.equals("y")) {
				continue;
			} else {
				System.out.println("문자열 검사를 종료합니다.");
				tf = false;
				break;
			}

		}
		sc.close();

	}

}
