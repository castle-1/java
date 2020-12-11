package java_20_12_07;

import java.util.Scanner;

public class ReverseMain {
	
	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;

		while (tf) {

			System.out.println("영문 문자열을 입력하세요.");
			sc = new Scanner(System.in);
			String reverse = sc.next(); //nextLine도 가능하지만 next를 더 선호

			Reverse re = new Reverse(reverse);
			re.show();
			
			

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
