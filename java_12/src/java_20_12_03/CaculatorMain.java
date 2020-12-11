package java_20_12_03;

import java.util.Scanner;


public class CaculatorMain {

	public static void main(String[] args) {
		
		boolean tf = true;
		Scanner sc = null;
		int num1,num2; // 대입값
		char operator; //연산자

		while(tf) {
			System.out.println("숫자와 연산자를 입력해주세요.[사용가능 연산자 : +,-,*,/] ex) 10 + 9");
			sc = new Scanner(System.in);
			num1 = sc.nextInt();
			operator = sc.next().charAt(0);
			num2 = sc.nextInt();
			
			Caculator caculator = new Caculator(num1, operator, num2);
			caculator.caculatorPrint();
			
			System.out.println("계산을 계속 하시겠습니까?(y/n)");
			String answer = sc.next();
			
			if(answer.equals("y") || answer.equals("Y")) {
				continue;
			}else {
				System.out.println("계산기를 종료합니다.");
				tf = false;
				break;
			}
			
		}
		sc.close();
	}

}
