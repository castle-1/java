package bs;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {

		boolean tf = true;
		Scanner sc = null;
		int kor, eng, math;
		String answer;

		while (tf) {
			sc = new Scanner(System.in);
			System.out.println("국여, 영어, 수학 점수를 입력하세요.");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();

			Grade park = new Grade(kor, eng, math);
			park.print();

			System.out.println("계속하시겠습니까? (y/n)");
			answer = sc.next();

			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				System.out.println("시스템을 종료하겠습니다.");
				tf = false;
				break;
			}

		}
		sc.close();
	}

}
