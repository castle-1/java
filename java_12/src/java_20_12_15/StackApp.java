package java_20_12_15;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		int index; //배열의 크기
		int count = 0; //배열의 인덱스를 증가시켜줌
		String[] strArr;// 입력한 크기만큼 배열을 만들어줄 변수

		Scanner sc = null;

		sc = new Scanner(System.in);
		System.out.println("0보다 큰수를 입력하세요.");
		System.out.print("총 스택 저장 공간의 크기 입력>>");

		do {// 0보다 작거나 같으면 계속 입력

			index = sc.nextInt();
		} while (index <= 0);

		strArr = new String[index]; //입력한 수의 크기만큼 배열 생성

		while (true) {

			try {// 예외처리 배열의 크기를 넘어가도 프로그램이 죽지 않는다.

				System.out.print("문자열 입력>>");
				strArr[count++] = sc.next();
			} catch (Exception e) {// 배열의 크기가 넘어가면 꽉찼다고 출력

				if (strArr.length < count) {
					System.out.println("스택이 꽉 차서 푸시 불가!");
					break;
				}
			}
		}

		if (sc.next().equals("그만")) {// 그만 입력하면 배열에 저장된 문자열을 출력

			System.out.print("스택에 저장된 모든 문자열 팝 : "); // 스택이기때문에 역순으로 출력
			for (int i = strArr.length - 1; i >= 0; i--) {
				System.out.print(strArr[i] + " ");
			}

		}

		sc.close();

	}

}
