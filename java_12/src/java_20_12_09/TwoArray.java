package java_20_12_09;

public class TwoArray {
//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고,
	// 2차원 배열을 화면에 출력하라

	private int[][] arr = new int[4][4];

	public void totalRun() {
		input();
		print();
	}

	private void input() {

		for (int i = 0; i < arr.length; i++) {//행

			for (int j = 0; j < arr[i].length; j++) { //열

				arr[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
	}

	private void print() {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

}
