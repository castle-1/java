package java_20_12_08;

import java.util.Scanner;

public class Med3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수 중앙값 구하기");
		
		System.out.println("a를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("b를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("c를 입력하세요.");
		int num3 = sc.nextInt();
		
		System.out.println("중앙값은 " + med3(num1, num2, num3));
		
		sc.close();
	}
	
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	/*static int med3(int a, int b, int c) {// 1 2 3

		if (a >= b) {
			if (b >= c) {
				return b;
			}
		} else if (a <= c) {
			if (b < c) {
				return a;
			} else {
				return c;
			}

		} else if (a > c) {
			return a;

		} else if (b > c) {
			return c;
		} else {
			return b;
		}

	}*/
}


