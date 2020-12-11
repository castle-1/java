package java_20_12_09;

public class SumArray {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int sum = sumOfAry(ar);
		System.out.println(sum);
	}

	 static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i = 0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;
	}

}
