package java_20_12_02;

/*System.out.println("숫자를 입력하시오.");
int num = sc.nextInt(); //프로그램의 제어권이 키보드로 넘어가게 된다.
int num2 = sc.nextInt(); //엔터 단위로 읽어드림
String name = sc.next();
System.out.println("입력한 숫자는 "+num);
System.out.println("입력한 숫자는 " + num2);
System.out.println("입력한 문자는 " + name);
*/

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		boolean yn = true;
		Scanner sc = null;
		int num1, num2, num3;

		while (yn) {
			
			sc = new Scanner(System.in);
			System.out.println("수학, 과학, 영어 점수를 입력하세요.");

			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();

			Grade me = new Grade(num1, num2, num3);
			System.out.printf("평균 : %.3f점\n", me.average());

			System.out.println("계속 하시겠습니까?(y/n)");
			String answer = sc.next(); //answer에는 주소가 들어가있음
			//char yesno = sc.next().charAt(0);//첫 번째 문자만 받음

			if (answer.equals("y") || answer.equals("Y")) { //answer == "y" 잘못된 표현 주소와 문자열을 비교할 수 없음
				continue;
			} else if (answer.equals("n") || answer.equals("N")) {
				System.out.println("시스템이 종료되었습니다.");
				yn = false;
				break;

			}
			sc.close();

		}

	}

}
