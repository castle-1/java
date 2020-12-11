package java_20_12_09;

import java.util.Arrays;

public class ArrayUtil {

	public static void main(String[] args) {

		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); //ar1배열의 인덱스를 전부 7로 채워라
		System.arraycopy(ar1, 0, ar2, 3, 4); //ar1[0]에 있는 값을 3번지부터 길이4까지(즉,3~6번지) ar1의 인덱스 복사

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
			
		}
		System.out.println();
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}

	}

}
