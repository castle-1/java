package java_20_12_17;

import java.util.Scanner;

public class ILOVEYOU {

	public static void main(String[] args) {

		char[] rotation;

		String str;
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다. ");
		str = sc.nextLine();
		rotation = new char[str.length()];

		for (int i = 0; i < rotation.length; i++) {
			rotation[i] = str.charAt(i);
		}

		do {
			System.out.println("오른쪽으로 쉬프트 합니다.");
			
			char temp = rotation[rotation.length - 1];

			for (int i = rotation.length - 1; i>0; i--) {
				 rotation[i] =rotation[i-1];

			}

			rotation[0] = temp;

			for (int i = 0; i < rotation.length; i++) {
				System.out.print(rotation[i]);
			}
			System.out.println();

			System.out.println("한번더 쉬프트 하시겠습니까?(1. yes / 2. no)");
			retry= sc.nextInt();
		} while (retry == 1);

		sc.close();

	}

}
