package java_20_12_09;

public class Big {
	// -5개의 숫자를 랜덤으로 받아 배열로 저장
	// -5개의 숫자중 가장 큰값을 출력
	private int max;
	private int[] big = new int[5];

	private void input() {

		for (int i = 0; i < big.length; i++) {
			big[i] = (int) (Math.random() * 10 + 1);

		}

	}

	private void bigRun() {
		max = big[0];
		for (int i = 0; i < big.length; i++) {
			if (big[i] > max) {
				max = big[i];
			}

		}
	}

	private void bigprint() {
		System.out.print("5숫자는 : ");
		for (int i = 0; i < big.length; i++) {
			System.out.print(big[i] + " ");
		}
		System.out.println();
		System.out.println("가장 큰 수는 : " + max);
	}

	public void totalRun() {

		input();
		bigRun();
		bigprint();

	}

}
