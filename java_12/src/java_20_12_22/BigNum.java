package java_20_12_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigNum {
	private ArrayList<Integer> num;

	public BigNum() {
		num = new ArrayList<Integer>();
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		int temp;

		while (true) {
			System.out.print("정수(-1이 입력될 때까지)>>");

			temp = sc.nextInt();
			num.add(temp);

			if (num.get(num.size() - 1) == -1) {
				break;
			}

		}

		Collections.sort(num);

		sc.close();
	}

	private void print() {

		System.out.println("가장 큰 수 는 : " + num.get(num.size() - 1));
	}

	public void run() {
		input();
		print();

	}

}
