package java_20_12_04;

import java.util.Scanner;

public class CountGameMain {

	public static void main(String[] args) {
		boolean tf = true;
		Scanner sc = null;

		while (tf) {

			System.out.println("게임을 시작하겠습니다. \n1~10중에서 예상하는 번호를 입력하세요.");
			sc = new Scanner(System.in);
			int player = sc.nextInt();
			
			CountGame countGame = new CountGame();
			countGame.setPlayer(player);			
			countGame.run();

			
			System.out.println("게임을 계속 하시겠습니까?(y/n)");
			String answer = sc.next();

			if (answer.equals("Y") || answer.equals("y")) {
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
