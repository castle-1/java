package java_20_12_09;

import java.util.Scanner;

public class Lotto {

	private int[] lotto = new int[6];
	private int[] myLotto = new int[lotto.length];

	public void totalRun() {
		inputMyLotto();// 플레이어가 번호 6개 입력
		run(); //com 6개의 숫자 난수 발생
		print();//6개의 난수 출력
		myLottoPrint(); //플레이어 난수 6개 출력
		dangchum();// 플레이어가 얼마나 맞췄는지 검사후 등수출력

	}

	private void dangchum() {
		int count = 0;
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == myLotto[i]) {
				count++;
			}
		}

		switch (count) {
		case 6: {
			System.out.println("6개 모두 맞추셨습니다. 1등입니다.");
			break;
		}
		case 5: {
			System.out.println("5개 맞추셨습니다. 2등입니다.");
			break;
		}
		case 4: {
			System.out.println("4개 맞추셨습니다. 3등입니다.");
			break;
		}
		case 3: {
			System.out.println("3개 맞추셨습니다. 4등입니다.");
			break;

		}
		default: {
			System.out.println("당첨되지 못했습니다.");
		}
		}

	}

	private void inputMyLotto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 6개를 입력하세요.(1~45)");
		for (int i = 0; i < myLotto.length; i++) {
			myLotto[i] = sc.nextInt();
		}
		sc.close();

	}

	private void myLottoPrint() {
		System.out.println("플레이어 번호");
		for (int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + "\t");
		}
		System.out.println();
	}

	private void run() {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {// 앞에번 숫자와 뒤에 숫자가 같다면

				if (lotto[j] == lotto[i]) { // ex) lotto[0] == lotto[1] 라면
					i--; // 중복됬으니 다시 돌아가서 난수를 받음
					break;
				}
			}

		}

	}

	private void print() {
		System.out.println("자동 생성 번호");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		}
		System.out.println();

	}
}
