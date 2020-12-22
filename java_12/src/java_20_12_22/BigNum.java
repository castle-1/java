package java_20_12_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigNum {
	private ArrayList<Integer> num; //arrayList '선언'

	public BigNum() {
		num = new ArrayList<Integer>(); //arrayList '초기화'
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		int temp; // add 할때 쓰일 '임시저장소'

		while (true) {
			System.out.print("정수(-1이 입력될 때까지)>>");

			temp = sc.nextInt();
			num.add(temp);

			if (num.get(num.size() - 1) == -1) { //arraylist도 배열처럼 '0번지' 부터 시작
				//num.get(0) -> 0번 인덱스의 값(인자)을 가져오겠다.
				//마지막 인덱스의 값(인자)를 가져오겠다는 의미
				break;
			}

		}

		Collections.sort(num);//오름차순정렬 collection클래스의 sort함수 호출 파라미터로 num

		sc.close();
	}

	private void print() {

		System.out.println("가장 큰 수 는 : " + num.get(num.size() - 1)); 
		//'오름차순' 정렬이기때문에 가장 마지막 인덱스가 가장 큰값(인자)
	}

	public void run() {
		input();
		print();

	}

}
