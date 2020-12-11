package java_20_12_03;

import java.util.Scanner;

public class RcsMain {

	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;
		String yn;
		int player;

		while (tf) {
			System.out.println("1.바위 2.가위 3.보 숫자로 입력하세요.");
			sc = new Scanner(System.in);
			player = sc.nextInt();
			

			Rcs rcs = new Rcs(player);
			rcs.rcsPrint();

			System.out.println("게임을 계속 하시겠습니까?(y/n)");
			yn = sc.next();

			if (yn.equals("Y") || yn.equals("y")) {
				continue;
			} else {
				System.out.println("게임을 종료하겠습니다.");
				tf = false;
				break;
			}

		}
		sc.close();
	}

}
