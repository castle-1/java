package java_20_12_09;

public class AvgArray {
//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
	// 그리고 배열에 든 숫자들과 평균을 출력하라.

	private int[] sum = new int[10];

	public void totalRun() {
		random();
		avg();
	}

	private void random() {
		for (int i = 0; i < sum.length; i++) {
			sum[i] = (int) (Math.random() * 10 + 1);
		}
	}

	private void avg() {
		int temp = 0;
		double avg = 0;
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < sum.length; i++) {
			temp += sum[i];
			System.out.print(sum[i] + " ");
			
		}
		avg = temp / (double)sum.length;
		
		System.out.println();
		System.out.println("총합 : " + temp);
		System.out.println("평균 : " + avg);

	}
	
	

	public int[] getSum() {
		return sum;
	}

	

	public void setSum(int[] sum) {
		this.sum = sum;
	}

}
