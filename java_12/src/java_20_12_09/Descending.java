package java_20_12_09;

public class Descending {
	// -5개의 숫자를 랜덤으로 받아 배열로 저장
	// -5개의 숫자를 내림차순으로 정렬하여 출력

	private int[] arr = new int[5];
	private int temp=0;

	private void input() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private void descending() {
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i+1 ; j <arr.length ; j++) { //i번째 자리의 숫자를 확정하기 위함
				if (arr[i] < arr[j]) { //첫번째 인덱스에 가장 큰수
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private void run() {
		System.out.println("내림차순 정렬");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void totalRun() {
		input();
		descending();
		run();
	}

}
