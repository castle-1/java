package java_20_12_15;

import java.util.Scanner;

public class CaculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0; 
		int y = 0;
		char op = ' ';
		
		try {
		System.out.print("1번 숫자를 입력하세요.>>");
		 x = sc.nextInt();

		System.out.print("2번 숫자를 입력하세요.>>");
		 y = sc.nextInt();

		System.out.print("op를 입력하세요>>");
		 op = sc.next().charAt(0);
		 
		}catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}

		Calculator2 calculator2 = new Calculator2(x, y, op);
		calculator2.show();
		sc.close();

	}

}
